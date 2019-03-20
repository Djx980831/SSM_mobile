package com.oracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.dao.PriceDao;

@Service
public class GetPriceService {

	@Autowired
	PriceDao dao;
	
	@Transactional(readOnly = true)
	public String getPrice(String code){
		return dao.getPrice(code);
	}
}
