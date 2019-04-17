package com.dao;

import com.entity.ActivityJoinEntity;

public interface ActivityJoinDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityJoinEntity record);

    int insertSelective(ActivityJoinEntity record);

    ActivityJoinEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActivityJoinEntity record);

    int updateByPrimaryKey(ActivityJoinEntity record);
}