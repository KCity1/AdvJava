package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CLoginServlet")
public class CLoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("Email");
		String password = request.getParameter("password");
		Cookie cemail = new Cookie("Email", email);
		Cookie cpassword = new Cookie("Password",password);
		response.addCookie(cpassword);
		response.addCookie(cemail);
		response.sendRedirect("CChoic.jsp");
	}
}
