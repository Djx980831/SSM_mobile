package com.oracle.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.dao.AddMobileNumDao;

@Service
public class AddMobileNumService {

	@Autowired
	AddMobileNumDao dao;
	
	@Transactional
	public void addNum(Map<String,Object> map) {
		dao.addNum(map);
	}
	
}
