package com.dao;

import com.entity.CustomEntity;

public interface CustomDao {
    int deleteByPrimaryKey(Long id);

    int insert(CustomEntity record);

    int insertSelective(CustomEntity record);

    CustomEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomEntity record);

    int updateByPrimaryKey(CustomEntity record);
}