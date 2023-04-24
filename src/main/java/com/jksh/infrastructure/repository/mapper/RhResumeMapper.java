package com.jksh.infrastructure.repository.mapper;

import com.jksh.application.common.model.QueryConditionForResume;
import com.jksh.infrastructure.repository.po.RhResume;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RhResumeMapper extends Mapper<RhResume> {
    
    
    @Select("select cos_of_resume from rh_resume where status = 0")
    List<String> selectNullOfInfo();


    /**
     * 根据筛选条件分页
     * @param queryConditionForResume
     * @return
     */
    List<RhResume> getPagePositionByCondition(QueryConditionForResume queryConditionForResume);

    List<RhResume> getCountByCondition(QueryConditionForResume queryConditionForResume);
    
    List<RhResume> getResumes(List<Integer> ids);
}