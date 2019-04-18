package com.dao;

import com.entity.AddressBookEntity;

public interface AddressBookDao {
    int deleteByPrimaryKey(Long id);

    int insert(AddressBookEntity record);

    int insertSelective(AddressBookEntity record);

    AddressBookEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AddressBookEntity record);

    int updateByPrimaryKey(AddressBookEntity record);
}