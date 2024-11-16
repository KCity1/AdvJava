package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InputNumberJSTLServlet")
public class InputNumberJSTLServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int number = Integer.parseInt(request.getParameter("number"));
		request.setAttribute("number", number);
		RequestDispatcher rd = request.getRequestDispatcher("InputTriangleJSTL.jsp");
		rd.forward(request, response);
	}
}
