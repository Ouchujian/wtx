package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.VoteDao;
import com.entity.VoteEntity;
import com.service.VoteService;

@Service("voteService")
public class VoteServiceImpl implements VoteService {
	
	@Autowired
	VoteDao voteDao;

	@Override
	public int save(VoteEntity entity) {
		// TODO Auto-generated method stub
		return voteDao.insertSelective(entity);
	}

	@Override
	public int update(VoteEntity entity) {
		// TODO Auto-generated method stub
		return voteDao.updateByPrimaryKey(entity);
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return voteDao.deleteByPrimaryKey(id);
	}

	@Override
	public VoteEntity queryObject(Long id) {
		// TODO Auto-generated method stub
		return voteDao.selectByPrimaryKey(id);
	}

}
