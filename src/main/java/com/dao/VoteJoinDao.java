package com.dao;

import com.entity.VoteJoinEntity;

public interface VoteJoinDao {
    int deleteByPrimaryKey(Long id);

    int insert(VoteJoinEntity record);

    int insertSelective(VoteJoinEntity record);

    VoteJoinEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VoteJoinEntity record);

    int updateByPrimaryKey(VoteJoinEntity record);
}