package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculateAgeServlet")
public class CalculateAgeServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		String birthyearStr= request.getParameter("birthyear");
		
		boolean isError = false;
		String error = "";
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");		
		if(birthyearStr.equals(null) || birthyearStr.trim().length()==0)
		{
			isError = true;
			error="Please Enter All Values";
		}
		else if(birthyearStr.matches("[0-9]{4}")==false)
		{	
			isError = true;
			error="Please Enter Valid Year!";						
		}
		
		if (isError) {
			out.print(error);
		}
		else
		{
//			Integer currentYear = 2024;
			Integer currentYear = Calendar.getInstance().get(Calendar.YEAR);
			Integer Birthyear = Integer.parseInt(birthyearStr);
			Integer age = 0;
			if(Birthyear>currentYear|| Birthyear<currentYear-100)
			{
				error="Please Enter Feasible Year";
				out.print(error);
			}
			else {
				age = currentYear-Birthyear;
				out.print("<h1>"+age+"</h1>");
			}			
		}
	}
}
