package com.dao;

import com.entity.SysUserEntity;
import java.math.BigDecimal;

public interface SysUserDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysUserEntity record);

    int insertSelective(SysUserEntity record);

    SysUserEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SysUserEntity record);

    int updateByPrimaryKey(SysUserEntity record);
}