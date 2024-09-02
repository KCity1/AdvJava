package com.controller.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/NameServlet1")
public class NameFilter1 implements Filter {
	public void init(FilterConfig arg0) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("NameFilter1:doFilter");
		String name = request.getParameter("name");
		if (name == null || name.trim().length() == 0) {
			//red Signal----> Go back
			request.setAttribute("nameError","Please Enter Name Field");
			RequestDispatcher rd = request.getRequestDispatcher("Name1.jsp");
			rd.forward(request, response);
		} else {
			chain.doFilter(request, response);// greenSignal
		}

	}

	public void destroy() {

	}

}
