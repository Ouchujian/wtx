package com.dao;

import com.entity.VoteJoinEntity;
import java.math.BigDecimal;

public interface VoteJoinDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(VoteJoinEntity record);

    int insertSelective(VoteJoinEntity record);

    VoteJoinEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(VoteJoinEntity record);

    int updateByPrimaryKey(VoteJoinEntity record);
}