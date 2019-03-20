package com.oracle.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.service.GetPriceService;

@Controller
public class PriceAction {

	@Autowired
	GetPriceService service;
	
	@RequestMapping("/get")
	@ResponseBody
	public String getPrice(String D1) {
		return service.getPrice(D1);
	}
	
	@RequestMapping(value="/cha")
	public String cha() {
		return "charge";
	}
}
