package com.dao;

import com.entity.AddressBookJoinEntity;
import java.math.BigDecimal;

public interface AddressBookJoinDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(AddressBookJoinEntity record);

    int insertSelective(AddressBookJoinEntity record);

    AddressBookJoinEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(AddressBookJoinEntity record);

    int updateByPrimaryKey(AddressBookJoinEntity record);
}