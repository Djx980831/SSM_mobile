package com.oracle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.dao.InsertWorkDao;

@Service
public class InsertWorkService {

	@Autowired
	InsertWorkDao dao;
	
	@Transactional
	public void insert2(String D1,String [] C1) {
		int len = C1.length;
		for(int i = 0; i < len; i++) {
			dao.insert2(D1, C1[i]);
		}
	}
	
}
