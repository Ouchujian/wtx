package com.dao;

import com.entity.AddressBookEntity;
import java.math.BigDecimal;

public interface AddressBookDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(AddressBookEntity record);

    int insertSelective(AddressBookEntity record);

    AddressBookEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(AddressBookEntity record);

    int updateByPrimaryKey(AddressBookEntity record);
}