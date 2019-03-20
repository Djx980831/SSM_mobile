package com.oracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.dao.LoginDao;
import com.oracle.vo.Operator;

@Service
public class LoginService {
	
	@Autowired
	LoginDao dao;
	
	@Transactional(readOnly = true)
	public Operator getLogin(String operator_Name,String operator_Pwd) {
		return dao.login(operator_Name, operator_Pwd);
	}
	
}
