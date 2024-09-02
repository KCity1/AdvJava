package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NameServlet1")
public class NameServlet1 extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		String name = request.getParameter("name");
		name= name.toUpperCase();
		request.setAttribute("UpperName", name);
		RequestDispatcher rd = request.getRequestDispatcher("NameUpper1.jsp");
		rd.forward(request, response);
	}

}
