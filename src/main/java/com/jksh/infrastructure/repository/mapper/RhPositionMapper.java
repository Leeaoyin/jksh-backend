package com.jksh.infrastructure.repository.mapper;

import com.jksh.application.common.model.QueryConditionForPosition;
import com.jksh.infrastructure.repository.po.RhPosition;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RhPositionMapper extends Mapper<RhPosition> {
    


    /**
     * 根据筛选条件分页
     * @param queryConditionForPosition
     * @return
     */
    List<RhPosition> getPagePositionByCondition(QueryConditionForPosition queryConditionForPosition);

    List<RhPosition> getCountByCondition(QueryConditionForPosition queryConditionForPosition);

    /**
     * 
     * @param positionId
     * @param offset
     * @param pageSize
     * @return
     */
    List<RhPosition> getPositionOfUser(List<Integer> positionId,
                                       @Param("offset") Integer offset, 
                                       @Param("pageSize") Integer pageSize);
    
    
    
}