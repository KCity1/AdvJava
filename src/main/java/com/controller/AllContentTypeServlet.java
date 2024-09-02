package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AllContentTypeServlet")
public class AllContentTypeServlet extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("firstname");
		String BirthYear= request.getParameter("birthyear");
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		String Gender= request.getParameter("gender");
		String City = request.getParameter("City");
		String Hobby[] = request.getParameterValues("hobby");
		
		
		boolean isError = false;
		String Error = "Please Enter All the Required Fields Correctly!";
		Integer birthyear = Integer.parseInt(BirthYear);
		Integer currentYear = Calendar.getInstance().get(Calendar.YEAR);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(name.equals(null) || name.trim().length()==0)
		{
			isError = true;
			Error += "<br>Name";
		}
		if(birthyear>currentYear)
		{
			isError = true;
			Error += "<br>Birth Year";
		}
		if(email.equals(null)|| email.trim().length()==0)
		{
			isError = true;
			Error += "<br>Email";
		}
		if(password.equals(null) || password.trim().length()==0)
		{
			isError = true;
			Error += "<br>Password";
		}
		if(Gender.equals(null))
		{
			isError = true;
			Error += "<br>Gender";
		}
		if(City.equals(null)||City.trim().length()==0)
		{
			isError = true;
			Error += "<br>City";
		}
		if(Hobby==null)
		{
			isError = true;
			Error += "<br>Hobby";
		}
		
		
		
		
		if(isError)
		{
			out.print(Error);
		}
		else {		
			out.print("Name: "+name+"<br>");
			out.print("Birth Year: "+BirthYear+"<br>");
			out.print("Email ID:"+email+"<br>");
			out.print("Password :"+password+"<br>");
			out.print("Gender :"+Gender+"<br>");
			out.print("City :"+City+"<br>");
			out.print("Hobby :");
			for(int x=0;x<Hobby.length;x++)
			{
				out.print(Hobby[x]+"<br>");
			}
		}
	}
}
