package com.oracle.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.service.LoginService;

@Controller
public class LoginAction {
	
	@Autowired
	LoginService service;	
	
	@RequestMapping(value="/login")
	public String getLogin(HttpSession session,String operator_Name,String operator_Pwd) {
		
		 if(service.getLogin(operator_Name, operator_Pwd) != null) {
			 session.setAttribute("user", service.getLogin(operator_Name, operator_Pwd));
			 return "main";
		 } 
		return "index";
	}
	
	@RequestMapping(value="/logout")
	public String getLogout(HttpServletRequest request) {
		
		request.getSession().invalidate();
		
		return "index";
	}
	
}
