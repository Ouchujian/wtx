package com.dao;

import com.entity.SysUserInfoEntity;

public interface SysUserInfoDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserInfoEntity record);

    int insertSelective(SysUserInfoEntity record);

    SysUserInfoEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserInfoEntity record);

    int updateByPrimaryKey(SysUserInfoEntity record);
}