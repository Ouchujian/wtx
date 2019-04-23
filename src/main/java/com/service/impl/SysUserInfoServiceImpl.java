package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SysUserInfoDao;
import com.service.SysUserInfoService;

@Service("sysUserInfoService")
public class SysUserInfoServiceImpl implements SysUserInfoService {
	
	@Autowired
	SysUserInfoDao sysUserInfoDao;
  
}
