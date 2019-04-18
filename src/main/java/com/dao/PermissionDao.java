package com.dao;

import com.entity.SysPermissionEntity;

public interface PermissionDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysPermissionEntity record);

    int insertSelective(SysPermissionEntity record);

    SysPermissionEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysPermissionEntity record);

    int updateByPrimaryKey(SysPermissionEntity record);
}