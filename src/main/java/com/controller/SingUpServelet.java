package com.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SingUpServelet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("SignUp Service Request Comepleted :: Service()");
	}
}
