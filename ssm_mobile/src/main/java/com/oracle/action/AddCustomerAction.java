package com.oracle.action;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.service.AddCustomerService;

@Controller
public class AddCustomerAction {



	@Autowired
	AddCustomerService service;	
	
	@RequestMapping(value="/add1")
	public String add1(HttpSession session, String id_Type,String id_Number) {
		service.add1(id_Type, id_Number);
		
		
		session.setAttribute("id_Type", id_Type);
		session.setAttribute("id_Number", id_Number);
		
		return "newCustomer1";
	}




	
	@RequestMapping(value="/add")
	public String add1() {
		return "newCustomer";
	}
	
	
	
	@RequestMapping(value="/add2")
	public String add2(HttpSession session, String customer_Name,String customer_Birth,String customer_Sex,String customer_Addre) {
		
		String num = (String) session.getAttribute("id_Number");
		service.add2(customer_Name, customer_Birth, customer_Sex, customer_Addre, num);
		
		return "newUser";
	}
	
	@RequestMapping(value="/add3")
	public String add3(HttpSession session,String T1,String R1,String R2,Integer T2) {
		
		Map<String,Object> map = new HashMap<String,Object>();
		Map<String,Object> map1 = new HashMap<String,Object>();
		
		map.put("mobile_Number",T1);
		map.put("roaming_Status",R1);
		map.put("com_Lelel",R2);
		map.put("user_Id",T2);
		
		service.add3(map);
		String num = (String) session.getAttribute("id_Number");
		
		System.out.println("------"+num);
		
		map1.put("id_Number",num);
		map1.put("user_Id",T2);
		
		service.add4(map1);
		
		return "saveInfo";
	}
	
	
	
	
}
