package com.service;

import com.entity.VoteActivityEntity;

public interface VoteActivityService {
	
	int save(VoteActivityEntity entity);

	int update(VoteActivityEntity entity);

	int delete(Long id);

	VoteActivityEntity queryObject(Long id);
}
