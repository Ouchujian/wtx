package com.dao;

import com.entity.SysUserInfoEntity;
import java.math.BigDecimal;

public interface SysUserInfoDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysUserInfoEntity record);

    int insertSelective(SysUserInfoEntity record);

    SysUserInfoEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SysUserInfoEntity record);

    int updateByPrimaryKey(SysUserInfoEntity record);
}