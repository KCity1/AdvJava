package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrastionServlet")
public class RegistrastionServlet extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		System.out.println("Gello....Registration Done!");
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		out.print("<h1>Gello Registration Done Sucessfully!</h1>");
	}
}
