package com.dao;

import com.entity.VoteEntity;

public interface VoteDao {
    int deleteByPrimaryKey(Long id);

    int insert(VoteEntity record);

    int insertSelective(VoteEntity record);

    VoteEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VoteEntity record);

    int updateByPrimaryKey(VoteEntity record);
}