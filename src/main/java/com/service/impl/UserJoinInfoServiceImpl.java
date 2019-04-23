package com.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserJoinInfoDao;
import com.entity.UserJoinInfoEntity;
import com.service.UserJoinInfoService;

@Service("userJoinInfoService")
public class UserJoinInfoServiceImpl implements UserJoinInfoService {
	
	@Autowired
	UserJoinInfoDao userJoinInfoDao;

	@Override
	public List<UserJoinInfoEntity> queryList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return userJoinInfoDao.queryList(params);
	}

	@Override
	public void save(UserJoinInfoEntity entity) {
		userJoinInfoDao.save(entity);
	}

	@Override
	public int update(UserJoinInfoEntity entity) {
		// TODO Auto-generated method stub
		return userJoinInfoDao.update(entity);
	}

	@Override
	public int queryTotal(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return userJoinInfoDao.queryTotal(params);
	}

}
