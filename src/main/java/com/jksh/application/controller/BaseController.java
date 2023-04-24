package com.jksh.application.controller;import com.jksh.application.common.enums.HttpCodeEnum;import com.jksh.domain.event.Const;import com.jksh.infrastructure.repository.po.RhSysUser;import com.jksh.infrastructure.utils.TokenUtils;import org.apache.commons.lang3.StringUtils;import org.springframework.beans.factory.annotation.Autowired;import java.util.Map;import java.util.concurrent.ConcurrentHashMap;public class BaseController {    public static Map<Object, HttpCodeEnum> systemMap = new ConcurrentHashMap<>();    @Autowired    protected TokenUtils tokenUtils;        protected Boolean existAdmin(RhSysUser user){        return StringUtils.equals(Const.ADMIN_TYPE, user.getUserType());    }        protected Boolean hasUserActive(RhSysUser user){        return StringUtils.equals(Const.ACTIVE_TYPE, user.getStatus());    }}