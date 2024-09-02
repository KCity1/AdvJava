package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeRegistrationServlet")
public class EmployeeRegistrationServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		String name = request.getParameter("FirstName");
		String email = request.getParameter("Email");
		String Password = request.getParameter("Password");
		String DOB = request.getParameter("DOB");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Successfully Registerd</h1><br>");
		out.print("Name : " + name +"<br><br>");
		out.print("Email : " +email +"<br><br>");
		out.print("Password : " + Password +"<br><br>");
		out.print("Date of Birth : " + DOB +"<br><br>");
	}
}