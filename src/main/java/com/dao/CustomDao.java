package com.dao;

import com.entity.CustomEntity;
import java.math.BigDecimal;

public interface CustomDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(CustomEntity record);

    int insertSelective(CustomEntity record);

    CustomEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(CustomEntity record);

    int updateByPrimaryKey(CustomEntity record);
}