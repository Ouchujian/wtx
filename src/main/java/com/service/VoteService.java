package com.service;

import com.entity.VoteEntity;

public interface VoteService {
	
	int save(VoteEntity entity);

	int update(VoteEntity entity);

	int delete(Long id);

	VoteEntity queryObject(Long id);
}
