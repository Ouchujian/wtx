package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.ActivityJoinEntity;

public interface ActivityJoinDao {
    int deleteByPrimaryKey(Long id);

    int insert(ActivityJoinEntity record);

    int insertSelective(ActivityJoinEntity record);

    ActivityJoinEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivityJoinEntity record);

    int updateByPrimaryKey(ActivityJoinEntity record);
    
    List<ActivityJoinEntity> queryList(Map<String,Object> params);
}