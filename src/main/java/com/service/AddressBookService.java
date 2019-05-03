package com.service;

import com.entity.AddressBookEntity;

public interface AddressBookService {
	
	int save(AddressBookEntity entity);

	int update(AddressBookEntity entity);

	int delete(Long id);

	AddressBookEntity queryObject(Long id);
}
