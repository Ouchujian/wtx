package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ActivityDao;
import com.entity.ActivityEntity;
import com.service.ActivityService;

@Service("activityService")
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	ActivityDao activityDao;
  
	@Override
	public Long save(ActivityEntity entity) {
		// TODO Auto-generated method stub	
		return activityDao.save(entity);
	}

	@Override
	public int update(ActivityEntity entity) {
		// TODO Auto-generated method stub
		return activityDao.update(entity);
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return activityDao.delete(id);
	}

	@Override
	public ActivityEntity queryObject(Long id) {
		// TODO Auto-generated method stub
		return activityDao.queryObject(id);
	}

}
