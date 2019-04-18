package com.dao;

import com.entity.VoteActivityEntity;

public interface VoteActivityDao {
    int deleteByPrimaryKey(Long id);

    int insert(VoteActivityEntity record);

    int insertSelective(VoteActivityEntity record);

    VoteActivityEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VoteActivityEntity record);

    int updateByPrimaryKey(VoteActivityEntity record);
}