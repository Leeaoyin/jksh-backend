package com.letgee.application.interceptor;

import com.letgee.application.common.enums.HttpCodeEnum;
import com.letgee.application.common.exception.ServerException;
import com.letgee.domain.event.Const;
import com.letgee.domain.event.ErrorMsg;
import com.letgee.domain.service.UserService;
import com.letgee.infrastructure.repository.po.RhSysUser;
import com.letgee.infrastructure.utils.TokenUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;
import java.util.Optional;

import static com.letgee.application.common.enums.HttpCodeEnum.UNAUTHORIZED;
import static com.letgee.application.controller.BaseController.systemMap;

@Slf4j
@Component
public class AuthenticationInterceptor implements HandlerInterceptor {
    
    @Autowired
    TokenUtils tokenUtils;
    
    @Autowired
    UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        
        String token = request.getHeader(Const.TOKEN_HEADER_STRING);
        if (Objects.isNull(token)) {    
            log.error("{} : request token error", request.getServletPath());
            throw new ServerException(UNAUTHORIZED.getCode(), ErrorMsg.ERR_LOAD_DATA_TOKEN);
//            response.setStatus(HttpCodeEnum.UNAUTHORIZED.getCode());
//            response.getWriter().print(ErrorMsg.ERR_LOAD_DATA_TOKEN);
//            return false;
        }
        if (tokenUtils.isExpired(token)){
            log.error("{} : token has expired", request.getServletPath());
            throw new ServerException(UNAUTHORIZED.getCode(), ErrorMsg.ERR_LOAD_DATA_TOKEN);
//            return false;
        }
        String username  = tokenUtils.getUsername(token);
        if (!Optional.of(username).isPresent()) {
            log.error("{} : token user not found", request.getServletPath());
            throw new ServerException(UNAUTHORIZED.getCode(), ErrorMsg.ERR_LOAD_DATA_TOKEN);
        }
        
        RhSysUser user = userService.getByUsername(username);
        if (request.getServletPath().matches("/v1/user/verify/.*")){
            if (!StringUtils.equals(user.getUserType(), Const.ADMIN_TYPE)){
                log.error("{} : can not verify other user", user.getAccount());
                throw new ServerException(UNAUTHORIZED.getCode(), ErrorMsg.ERR_LOAD_DATA_TOKEN);
            }
        }
        request.setAttribute(Const.CURRENT_USER,user);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
