package com.dao;

import com.entity.SysBookmarksEntity;
import java.math.BigDecimal;

public interface SysBookmarksDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysBookmarksEntity record);

    int insertSelective(SysBookmarksEntity record);

    SysBookmarksEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SysBookmarksEntity record);

    int updateByPrimaryKey(SysBookmarksEntity record);
}