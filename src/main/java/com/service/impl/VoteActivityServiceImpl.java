package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.VoteActivityDao;
import com.entity.VoteActivityEntity;
import com.service.VoteActivityService;

@Service("voteActivityService")
public class VoteActivityServiceImpl implements VoteActivityService {

	@Autowired
	VoteActivityDao voteActivityDao;

	@Override
	public int save(VoteActivityEntity entity) {
		// TODO Auto-generated method stub
		return voteActivityDao.insertSelective(entity);
	}

	@Override
	public int update(VoteActivityEntity entity) {
		// TODO Auto-generated method stub
		return voteActivityDao.updateByPrimaryKeySelective(entity);
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return voteActivityDao.deleteByPrimaryKey(id);
	}

	@Override
	public VoteActivityEntity queryObject(Long id) {
		// TODO Auto-generated method stub
		return voteActivityDao.selectByPrimaryKey(id);
	}
	
}
