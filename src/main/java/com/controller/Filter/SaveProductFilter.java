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

@WebFilter("/SaveProductServlet")
public class SaveProductFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("do Filter:: Start");
		RequestDispatcher rd = request.getRequestDispatcher("InputProduct.jsp");
		String name = request.getParameter("Name");
		String Price = request.getParameter("Price");
		String category = request.getParameter("category");
		String qty = request.getParameter("qty");
		boolean flag = true;

		// validation of data!
		if (name == null || name.trim().length() == 0) {
			request.setAttribute("NameError", "Please Enter Name!");
			request.setAttribute("Name", name);
			flag = false;
		}
		request.setAttribute("Name", name);
		if (Price == null || Price.trim().length() == 0 || !Price.matches("[0-9]+")) {
			request.setAttribute("PriceError", "Please Enter Price Correctly!");
			flag = false;
		}

		request.setAttribute("Price", Price);

		if (category == null || category.trim().length() == 0) {
			request.setAttribute("CategoryError", "Please Enter category Correctly!");
			flag = false;
		}
		request.setAttribute("category", category);

		if (qty == null || qty.trim().length() == 0 || !qty.matches("[0-9]+")) {
			request.setAttribute("QtyError", "Please Enter Price Correctly!");
			flag = false;
		}
		request.setAttribute("qty", qty);

		if (flag)// if True!
		{
			chain.doFilter(request, response);
			System.out.println("do Filter:: true");
		} else// if False!
		{
			rd.forward(request, response);
			System.out.println("do Filter::false");
		}
	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}
