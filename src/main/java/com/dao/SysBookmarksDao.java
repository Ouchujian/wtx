package com.dao;

import com.entity.SysBookmarksEntity;

public interface SysBookmarksDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysBookmarksEntity record);

    int insertSelective(SysBookmarksEntity record);

    SysBookmarksEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysBookmarksEntity record);

    int updateByPrimaryKey(SysBookmarksEntity record);
}