package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AddressBookDao;
import com.entity.AddressBookEntity;
import com.service.AddressBookService;

@Service("addressBookService")
public class AddressBookServiceImpl implements AddressBookService {
	
	@Autowired
	AddressBookDao addressBookDao;

	@Override
	public int save(AddressBookEntity entity) {
		// TODO Auto-generated method stub
		return addressBookDao.insertSelective(entity);
	}

	@Override
	public int update(AddressBookEntity entity) {
		// TODO Auto-generated method stub
		return addressBookDao.updateByPrimaryKey(entity);
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return addressBookDao.deleteByPrimaryKey(id);
	}

	@Override
	public AddressBookEntity queryObject(Long id) {
		// TODO Auto-generated method stub
		return addressBookDao.selectByPrimaryKey(id);
	}
	
	
}
