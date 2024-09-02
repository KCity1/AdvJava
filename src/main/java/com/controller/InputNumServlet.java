package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InputNumServlet")
public class InputNumServlet extends HttpServlet
{

	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
		
		System.out.println("Addition Done!");
		String number1= request.getParameter("number1");
		int num1 = Integer.parseInt(number1);
		String number2= request.getParameter("number2");
		int num2 = Integer.parseInt(number2);
		int sum = num1+num2;
		
		PrintWriter out = response.getWriter();
		
		out.print(sum);
	}
}
