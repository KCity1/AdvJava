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

@WebFilter("/NameServlet2")
public class NameFilter2 implements Filter {
	public void init(FilterConfig arg0) throws ServletException {

		
	}
	 public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		 System.out.println();
		String name = request.getParameter("userName"); 
		if(name == null || name.trim().length() == 0)
		{
//			red Flag!
			request.setAttribute("nameError", "Please Enter Name Correctly!");
			RequestDispatcher rd = request.getRequestDispatcher("Name2.jsp");
			rd.forward(request, response);
		}
		else
		{
			//green Flag!
			chain.doFilter(request, response);
		}
	}
	public void destroy() {
		
	}

}
