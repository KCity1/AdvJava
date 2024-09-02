package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		int num1 = Integer.parseInt(request.getParameter("n1"));
		int num2 = Integer.parseInt(request.getParameter("n2"));
		String opp = request.getParameter("operation");
		int ans=0;
		if(opp.equals("+"))
		{
			ans = num1+num2;
			opp ="Addition ";
		}
		else if(opp.equals("-"))
		{
			ans = num1-num2;
			opp ="Subtraction ";
		}
		else if(opp.equals("*"))
		{
			ans = num1*num2;
			opp ="Multiplication ";
		}
		else if(opp.equals("/"))
		{
			ans = num1/num2;
			opp ="Division ";
		}
		PrintWriter out = response.getWriter();
		out.print("<h1>"+ opp +":"+" "+ans+"</h1>");
	}
}
