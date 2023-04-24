package com.letgee.application.controller.resumeService;import com.letgee.application.common.annotation.CurrentUser;import com.letgee.application.common.enums.HttpCodeEnum;import com.letgee.application.common.model.Page;import com.letgee.application.common.model.QueryConditionForResume;import com.letgee.application.common.model.QueryParam;import com.letgee.application.common.param.dto.ResumeConditionDTO;import com.letgee.application.common.param.dto.ResumeDTO;import com.letgee.application.common.param.result.ResponseResult;import com.letgee.application.common.param.vo.ResumeVO;import com.letgee.application.common.param.vo.VerifyVO;import com.letgee.application.controller.BaseController;import com.letgee.domain.event.Const;import com.letgee.domain.service.ResumeService;import com.letgee.infrastructure.repository.po.RhSysUser;import com.letgee.infrastructure.utils.JsonUtils;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.web.bind.annotation.*;import org.springframework.web.multipart.MultipartFile;import javax.annotation.Resource;import javax.validation.Valid;import java.io.IOException;import java.util.Date;@RestController@RequestMapping(value = Const.API_URL + "/resume")public class ResumeController extends BaseController {        private static Logger logger = LoggerFactory.getLogger(ResumeController.class);            @Resource    ResumeService resumeService;    /**     * 创建简历，其中phone需唯一     * @param user     * @param resumeDTO     * @return     */    @PostMapping(value = "/create")    public ResponseResult<VerifyVO> createResume(@CurrentUser RhSysUser user,                                                   @RequestBody @Valid ResumeDTO resumeDTO){                Boolean result = resumeService.createResume(user.getId(), resumeDTO);        if (result){            logger.info("{} : create resume successfully",resumeDTO.getName());            return ResponseResult.success(VerifyVO.builder().success(result).build());        }        return ResponseResult.error(HttpCodeEnum.FAIL);    }    @PostMapping(value = "/upload")    public ResponseResult<ResumeVO> uploadFile(@CurrentUser RhSysUser user,@RequestParam(value = "file") MultipartFile file){        return ResponseResult.success(resumeService.uploadFile(user, file));    }                @PostMapping(value = "/list")    public ResponseResult<Page> queryPageByPost(@CurrentUser RhSysUser user, @RequestBody ResumeConditionDTO resumeConditionDTO){                QueryParam queryParam = QueryParam.builder()                .page_num(resumeConditionDTO.getPage_num())                .page_size(resumeConditionDTO.getPage_size())                .build();                QueryConditionForResume queryConditionForResume = QueryConditionForResume.QueryConditionBuilder                .QueryConditionBuilder()                .withCity(resumeConditionDTO.getCity())                .withDegree(resumeConditionDTO.getDegree())                .withYearOfWork(resumeConditionDTO.getYear_of_work())                .withTag(resumeConditionDTO.getTag())                .withKeyWord(resumeConditionDTO.getKey_word())                .withOffset((queryParam.getPage_num()-1)* queryParam.getPage_size())                .withPageSize(queryParam.getPage_size())                .build();        return ResponseResult.success(resumeService.queryPageOfResume(user, queryParam, queryConditionForResume));    }        }