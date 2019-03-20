package com.oracle.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.service.InsertWorkService;

@Controller
public class InsertWorkAction {
	
	@Autowired
	InsertWorkService service;	
	
	@RequestMapping(value="/insert2")
	public String insert2(String D1,String [] C1) {
		
		service.insert2(D1, C1);
		
		return "saveInfo2";
	}
	
}
