package com.dao;

import com.entity.SysConfigEntity;
import java.math.BigDecimal;

public interface SysConfigDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysConfigEntity record);

    int insertSelective(SysConfigEntity record);

    SysConfigEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SysConfigEntity record);

    int updateByPrimaryKey(SysConfigEntity record);
}