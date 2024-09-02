package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginPageServlet")
public class LoginPageServlet extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		System.out.println("Login Done Succesfully!");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<h1>Login Done Succesfully!<h1>");
	}

}
