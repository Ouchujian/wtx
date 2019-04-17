package com.dao;

import com.entity.VoteActivityEntity;
import java.math.BigDecimal;

public interface VoteActivityDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(VoteActivityEntity record);

    int insertSelective(VoteActivityEntity record);

    VoteActivityEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(VoteActivityEntity record);

    int updateByPrimaryKey(VoteActivityEntity record);
}