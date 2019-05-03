package com.dao;

import com.entity.VoteActivityEntity;

public interface VoteActivityDao {
    int deleteByPrimaryKey(Long id);

    int insert(VoteActivityEntity entity);

    int insertSelective(VoteActivityEntity entity);

    VoteActivityEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VoteActivityEntity entity);

    int updateByPrimaryKey(VoteActivityEntity entity);
}