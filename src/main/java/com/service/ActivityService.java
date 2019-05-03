package com.service;

import com.entity.ActivityEntity;

public interface ActivityService {
	Long save(ActivityEntity entity);
	int update(ActivityEntity entity);
	int delete(Long id);
	ActivityEntity queryObject(Long id);
}
