package com.dao;

import com.entity.SysRoleEntity;
import java.math.BigDecimal;

public interface SysRoleDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysRoleEntity record);

    int insertSelective(SysRoleEntity record);

    SysRoleEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SysRoleEntity record);

    int updateByPrimaryKey(SysRoleEntity record);
}