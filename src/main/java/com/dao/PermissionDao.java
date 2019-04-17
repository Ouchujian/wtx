package com.dao;

import com.entity.SysPermissionEntity;
import java.math.BigDecimal;

public interface PermissionDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysPermissionEntity record);

    int insertSelective(SysPermissionEntity record);

    SysPermissionEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SysPermissionEntity record);

    int updateByPrimaryKey(SysPermissionEntity record);
}