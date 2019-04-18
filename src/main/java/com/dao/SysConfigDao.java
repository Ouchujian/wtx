package com.dao;

import com.entity.SysConfigEntity;

public interface SysConfigDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysConfigEntity record);

    int insertSelective(SysConfigEntity record);

    SysConfigEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysConfigEntity record);

    int updateByPrimaryKey(SysConfigEntity record);
}