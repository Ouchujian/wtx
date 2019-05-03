package com.dao;

import com.entity.AddressBookEntity;

public interface AddressBookDao {
    int deleteByPrimaryKey(Long id);

    int insert(AddressBookEntity entity);

    int insertSelective(AddressBookEntity entity);

    AddressBookEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AddressBookEntity entity);

    int updateByPrimaryKey(AddressBookEntity entity);
}