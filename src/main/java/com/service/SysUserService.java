package com.service;

import com.entity.SysUserEntity;

public interface SysUserService {
	SysUserEntity selectByWxid(String wxId);
	
    SysUserEntity selectByPrimaryKey(Long id);
}
