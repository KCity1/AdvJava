package com.controller;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmailDisplayServlet")
public class EmailDisplayServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String name = request.getParameter("Name");
		String email = request.getParameter("Email");
		String password = request.getParameter("Password");
		
		out.print("Name: "+name+"<br>");
		out.print("Email: "+email+"<br>");
		out.print("Password: "+password+"<br>");
		System.out.println("Login Done Successfully!");
	}
}
