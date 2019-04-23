package com.dao;

import com.entity.SysUserEntity;

public interface SysUserDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserEntity record);

    int insertSelective(SysUserEntity record);

    SysUserEntity selectByPrimaryKey(Long id);
    
    SysUserEntity selectByWxid(String wxId);

    int updateByPrimaryKeySelective(SysUserEntity record);

    int updateByPrimaryKey(SysUserEntity record);
}