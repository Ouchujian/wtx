package com.dao;

import com.entity.CustomJoinEntity;

public interface CustomJoinDao {
    int deleteByPrimaryKey(Long id);

    int insert(CustomJoinEntity record);

    int insertSelective(CustomJoinEntity record);

    CustomJoinEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomJoinEntity record);

    int updateByPrimaryKey(CustomJoinEntity record);
}