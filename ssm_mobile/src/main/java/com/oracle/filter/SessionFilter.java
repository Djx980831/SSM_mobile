package com.oracle.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.vo.Operator;

/**
 * Servlet Filter implementation class SessionFilter
 */
public class SessionFilter implements Filter {

	List<String> list = new ArrayList<String>();

	/**
	 * Default constructor.
	 */
	public SessionFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// 获得session
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String path = req.getServletPath();

		String a = req.getRequestURI();

		if (a.contains(".css") || a.contains(".js") || a.contains(".png") || a.contains(".jsp") || a.contains(".bak")
				|| a.contains(".jpg") || a.contains(".gif") || a.contains(".db")) {
			chain.doFilter(request, response);
		} else {
			if (list.contains(path)) {
				chain.doFilter(request, response);
			} else {
				HttpSession session = req.getSession();
				Operator emp = (Operator) session.getAttribute("user");
				if (emp != null) {
					chain.doFilter(request, response);
				} else {
					String context = req.getServletPath();
					res.sendRedirect("index.jsp");
				}
			}
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		list.add("/index.jsp");
		list.add("/login");
	}

}
