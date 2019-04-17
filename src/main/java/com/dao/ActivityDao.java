package com.dao;

import com.entity.ActivityEntity;
import java.math.BigDecimal;

public interface ActivityDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(ActivityEntity record);

    int insertSelective(ActivityEntity record);

    ActivityEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(ActivityEntity record);

    int updateByPrimaryKey(ActivityEntity record);
}