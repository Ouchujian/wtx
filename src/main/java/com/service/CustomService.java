package com.service;

import com.entity.CustomEntity;

public interface CustomService {
	
	int save(CustomEntity entity);

	int update(CustomEntity entity);

	int delete(Long id);

	CustomEntity queryObject(Long id);
}
