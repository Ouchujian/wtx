package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.CustomDao;
import com.entity.CustomEntity;
import com.service.CustomService;

@Service("customService")
public class CustomServiceImpl implements CustomService {
	@Autowired
	CustomDao customDao;

	@Override
	public int save(CustomEntity entity) {
		// TODO Auto-generated method stub
		return customDao.insertSelective(entity);
	}

	@Override
	public int update(CustomEntity entity) {
		// TODO Auto-generated method stub
		return customDao.updateByPrimaryKeySelective(entity);
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return customDao.deleteByPrimaryKey(id);
	}

	@Override
	public CustomEntity queryObject(Long id) {
		// TODO Auto-generated method stub
		return customDao.selectByPrimaryKey(id);
	}
}
