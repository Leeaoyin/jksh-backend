package com.jksh.infrastructure.repository.mapper;

import com.jksh.infrastructure.repository.po.RhSysUser;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RhSysUserMapper extends Mapper<RhSysUser> {

    List<RhSysUser> getGeneralUsers( @Param("offset") Integer offset, @Param("pageSize") Integer pageSize);
}