package com.dao;

import org.apache.ibatis.annotations.Param;

import com.entity.SysConfigEntity;

public interface SysConfigDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysConfigEntity record);

    int insertSelective(SysConfigEntity record);

    SysConfigEntity selectByPrimaryKey(Long id);
    
    SysConfigEntity selectByKey(@Param("key")String key);

    int updateByPrimaryKeySelective(SysConfigEntity record);

    int updateByPrimaryKey(SysConfigEntity record);
}