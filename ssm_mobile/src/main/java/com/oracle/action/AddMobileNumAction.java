package com.oracle.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.service.AddMobileNumService;
import com.oracle.service.GetPriceService;
import com.oracle.vo.RandomNum;

@Controller
public class AddMobileNumAction {

	@Autowired
	AddMobileNumService service;
	
	@RequestMapping("addMobileNum")
	public String addMobileNum(String MType,String T1,String T2) {
		
		Map<String,Object> map = new HashMap<String,Object>();
		String s = RandomNum.getRandom();
		int t1 = Integer.valueOf(T1).intValue();
		int t2 = Integer.valueOf(T2).intValue();
		
		for(int i = t1; i < t2; i++) {
			map.put("mobile_Number",i);
			map.put("mobile_Type",MType);
			map.put("card_Number",s);
			service.addNum(map);
			
		}
		
		return "saveInfo3";
	}
	
	@RequestMapping("addNum9")
	public String addNum9() {
		
		return "resource";
	}
	
}
