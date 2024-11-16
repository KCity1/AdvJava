package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/InputSessionTimeoutServlet")
public class InputSessionTimeoutServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int timeout = Integer.parseInt(request.getParameter("time"));
		HttpSession s = request.getSession();
		s.setMaxInactiveInterval(60*timeout);
		response.sendRedirect("CChoic.jsp");
	}
}