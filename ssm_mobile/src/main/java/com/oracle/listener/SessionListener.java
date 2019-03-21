package com.oracle.listener;

import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.ServletContextEvent;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.oracle.vo.Operator;

/**
 * Application Lifecycle Listener implementation class SessionListener
 *
 */
public class SessionListener implements HttpSessionListener, HttpSessionAttributeListener {

	
	static ConcurrentHashMap<String, HttpSession> map = new ConcurrentHashMap<String, HttpSession>();
    /**
     * Default constructor. 
     */
    public SessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }

    
    public void contextInitalized(ServletContextEvent sce) {
    	//向上下文中加入一个属性
    	sce.getServletContext().setAttribute("loginMap", SessionListener.map);
    }
    
	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
    	//登录一个用户
    	if(se.getName().equals("user")) {
    		Operator emp = (Operator)se.getValue();
    		
    		//当前对象是否在线
    		if(map.containsKey(emp.getOperator_Name())) {
    			map.remove(emp.getOperator_Name()).invalidate();
    		}
    		
    		//向map中增加一个对象
    		map.put(emp.getOperator_Name(),se.getSession());
    		System.out.println(emp.getOperator_Name()+"-----------已上线");
    	}
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	
    	if(se.getName().equals("user")) {
    		Operator emp = (Operator)se.getValue();
         	map.remove(emp.getOperator_Name());
         	System.out.println(emp.getOperator_Name()+"-----------已下线");
         }
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
    	
    }
	
}
