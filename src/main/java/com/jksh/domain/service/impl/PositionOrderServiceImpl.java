package com.jksh.domain.service.impl;import com.jksh.application.common.enums.HttpCodeEnum;import com.jksh.application.common.exception.ServerException;import com.jksh.application.common.param.dto.BindDTO;import com.jksh.domain.service.PositionOrderService;import com.jksh.infrastructure.repository.mapper.RelUserPositionOrderMapper;import com.jksh.infrastructure.repository.mapper.RhPositionMapper;import com.jksh.infrastructure.repository.po.RelUserPositionOrder;import com.jksh.infrastructure.repository.po.RhPosition;import com.jksh.infrastructure.repository.po.RhSysUser;import com.jksh.infrastructure.utils.JsonUtils;import org.apache.commons.collections4.CollectionUtils;import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;import tk.mybatis.mapper.entity.Example;import javax.annotation.Resource;import java.util.Date;@Servicepublic class PositionOrderServiceImpl implements PositionOrderService {        @Resource    RelUserPositionOrderMapper relUserPositionOrderMapper;        @Resource    RhPositionMapper rhPositionMapper;        @Override    @Transactional(rollbackFor = {RuntimeException.class})    public Boolean takeOrderByUser(RhSysUser user, Integer positionId) {        synchronized (this) {            if (hasTake(user.getId(), positionId)){                throw new ServerException(HttpCodeEnum.SERVER_ERROR.getCode(),"请勿重复接单~");            }            RelUserPositionOrder reluop = new RelUserPositionOrder();            reluop.setUserId(user.getId());            reluop.setPositionId(positionId);            reluop.setStatus(0);            reluop.setCreateTime(new Date());            relUserPositionOrderMapper.insertSelective(reluop);            Example example = new Example(RhPosition.class);            example.createCriteria().andEqualTo("id", positionId);            RhPosition oldRhPosition = rhPositionMapper.selectOneByExample(example);            RhPosition newRhPosition = new RhPosition();            newRhPosition.setOrderCount(oldRhPosition.getOrderCount()+1);            return  rhPositionMapper.updateByExampleSelective(newRhPosition, example) > 0;        }    }    @Override    @Transactional(rollbackFor = {RuntimeException.class})    public Boolean bindResume(RhSysUser user, BindDTO bindDTO) {        RelUserPositionOrder relUserPositionOrder = new RelUserPositionOrder();        relUserPositionOrder.setResumeId(JsonUtils.parse(bindDTO.getRes_ids()));        relUserPositionOrder.setStatus(1);        Example example = new Example(RelUserPositionOrder.class);        example.createCriteria()                .andEqualTo("userId", user.getId())                .andEqualTo("positionId", bindDTO.getPos_id());        return relUserPositionOrderMapper.updateByExampleSelective(relUserPositionOrder, example) > 0;    }    private Boolean hasTake(Integer userId, Integer positionId){        Example example = new Example(RelUserPositionOrder.class);        example.createCriteria().andEqualTo("userId", userId)                .andEqualTo("positionId", positionId);        return CollectionUtils.isNotEmpty(relUserPositionOrderMapper.selectByExample(example));    }    }