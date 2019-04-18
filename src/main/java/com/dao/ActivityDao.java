package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.ActivityEntity;

public interface ActivityDao {
    int deleteByPrimaryKey(Long id);

    int insert(ActivityEntity record);

    int insertSelective(ActivityEntity record);

    ActivityEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivityEntity record);

    int updateByPrimaryKey(ActivityEntity record);
    
    List<ActivityEntity> queryList(Map<String,Object> params);
}