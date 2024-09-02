package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServlet3")
public class CalcServlet3 extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String opp = request.getParameter("opeation");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int sum = 0;
		
		boolean isError = false;
		String error = "";
		
		if(num1==null || num1.trim().length()==0)
		{
			isError = true;
			error += "<h1>Please Enter Number 1 <br>";
		}
		if(num2==null || num2.trim().length()==0)
		{
			isError = true;
			error += "Please Enter Number 2 <br>";
		}
		if(opp==null)
		{
			isError = true;
			error += "Please Select Operation <br>";
		}
		error += "</h1>";
		
		if (isError) {
			out.print(error);
		} else {
			String opperation = "s";
			int x = Integer.parseInt(num1);
			int y = Integer.parseInt(num2);
			if (opp.equals("+")) {
				sum = x + y;
				opperation = "Addition";
			} else if (opp.equals("-")) {
				sum = x - y;
				opperation = "Subtraction";
			} else if (opp.equals("*")) {
				sum = x * y;
				opperation = "Multiplication";
			} else if (opp.equals("/")) {
				sum = x / y;
				opperation = "Division (Num1/Num2)";
			}
			out.print("<h1>" + opperation + " :" + sum + "</h1>");
		}
	}
}