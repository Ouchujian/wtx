package com.dao;

import com.entity.VoteEntity;

public interface VoteDao {
    int deleteByPrimaryKey(Long id);

    int insert(VoteEntity entity);

    int insertSelective(VoteEntity entity);

    VoteEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VoteEntity entity);

    int updateByPrimaryKey(VoteEntity entity);
}