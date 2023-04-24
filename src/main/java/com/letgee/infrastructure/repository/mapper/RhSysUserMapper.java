package com.letgee.infrastructure.repository.mapper;

import com.letgee.infrastructure.repository.po.RhSysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RhSysUserMapper extends Mapper<RhSysUser> {

    List<RhSysUser> getGeneralUsers( @Param("offset") Integer offset, @Param("pageSize") Integer pageSize);
}