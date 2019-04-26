package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SysUserDao;
import com.entity.SysUserEntity;
import com.service.SysUserService;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	SysUserDao sysUserDao;

	@Override
	public SysUserEntity selectByWxid(String wxId) {
		// TODO Auto-generated method stub
		return sysUserDao.selectByWxid(wxId);
	}

	@Override
	public SysUserEntity selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return sysUserDao.selectByPrimaryKey(id);
	}
}
