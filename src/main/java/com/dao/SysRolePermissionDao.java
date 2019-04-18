package com.dao;

import com.entity.SysRolePermissionEntity;

public interface SysRolePermissionDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysRolePermissionEntity record);

    int insertSelective(SysRolePermissionEntity record);

    SysRolePermissionEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRolePermissionEntity record);

    int updateByPrimaryKey(SysRolePermissionEntity record);
}