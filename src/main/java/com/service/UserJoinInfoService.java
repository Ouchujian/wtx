package com.service;

import java.util.List;
import java.util.Map;

import com.entity.UserJoinInfoEntity;

public interface UserJoinInfoService {
	List<UserJoinInfoEntity> queryList(Map<String,Object> params);
	int queryTotal(Map<String,Object> params);
	void save(UserJoinInfoEntity entity);
	int update(UserJoinInfoEntity entity);
}
