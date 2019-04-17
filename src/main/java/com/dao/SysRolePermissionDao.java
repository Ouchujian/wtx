package com.dao;

import com.entity.SysRolePermissionEntity;
import java.math.BigDecimal;

public interface SysRolePermissionDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysRolePermissionEntity record);

    int insertSelective(SysRolePermissionEntity record);

    SysRolePermissionEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SysRolePermissionEntity record);

    int updateByPrimaryKey(SysRolePermissionEntity record);
}