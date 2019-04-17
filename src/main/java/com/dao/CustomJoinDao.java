package com.dao;

import com.entity.CustomJoinEntity;
import java.math.BigDecimal;

public interface CustomJoinDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(CustomJoinEntity record);

    int insertSelective(CustomJoinEntity record);

    CustomJoinEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(CustomJoinEntity record);

    int updateByPrimaryKey(CustomJoinEntity record);
}