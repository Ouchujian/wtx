package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.ActivityEntity;

public interface ActivityDao extends BaseDao<ActivityEntity>{
	
    int delete(Long id);

    Long save(ActivityEntity entity);
    
    List<ActivityEntity> queryList(Map<String,Object> params);
    
    ActivityEntity queryObject(Long id);
}