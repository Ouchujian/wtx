package com.dao;

import com.entity.AddressBookJoinEntity;

public interface AddressBookJoinDao {
    int deleteByPrimaryKey(Long id);

    int insert(AddressBookJoinEntity record);

    int insertSelective(AddressBookJoinEntity record);

    AddressBookJoinEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AddressBookJoinEntity record);

    int updateByPrimaryKey(AddressBookJoinEntity record);
}