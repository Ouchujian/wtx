package com.dao;

import com.entity.SysRoleEntity;

public interface SysRoleDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleEntity record);

    int insertSelective(SysRoleEntity record);

    SysRoleEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoleEntity record);

    int updateByPrimaryKey(SysRoleEntity record);
}