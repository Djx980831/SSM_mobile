package com.oracle.service;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.dao.AddCustomerDao;

@Service
public class AddCustomerService {

	@Autowired
	AddCustomerDao dao;

	@Transactional
	public void add1(String id_Type, String id_Number) {
		dao.add1(id_Type, id_Number);
	}
	
	@Transactional
	public void add2(String name, String birth, String sex, String addre, String num) {
		dao.add2(name, birth, sex, addre, num);
	}
	
//	@Transactional
//	public void add3(String num, String status,String lelel,Integer id) {
//		dao.add3(num, status, lelel, id);
//	}
	
	@Transactional
	public void add3(Map<String,Object> map) {
		dao.add3(map);
	}
	
	@Transactional
	public void add4(Map<String,Object> map) {
		dao.add4(map);
	}
	
}
