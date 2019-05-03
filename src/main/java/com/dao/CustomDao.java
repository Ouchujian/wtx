package com.dao;

import com.entity.CustomEntity;

public interface CustomDao {
    int deleteByPrimaryKey(Long id);

    int insert(CustomEntity entity);

    int insertSelective(CustomEntity entity);

    CustomEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomEntity entity);

    int updateByPrimaryKey(CustomEntity entity);
}