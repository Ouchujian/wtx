package com.dao;

import com.entity.VoteEntity;
import java.math.BigDecimal;

public interface VoteDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(VoteEntity record);

    int insertSelective(VoteEntity record);

    VoteEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(VoteEntity record);

    int updateByPrimaryKey(VoteEntity record);
}