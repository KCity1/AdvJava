package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/scopeServlet")
public class scopeServlet extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String location = request.getParameter("location");
		
		request.setAttribute("firstName", firstName);
		
		HttpSession session = request.getSession();
		session.setAttribute("email",email);
		
		ServletContext application = getServletContext();
		application.setAttribute("location", location);
		RequestDispatcher rd = request.getRequestDispatcher("scopeOutput.jsp");
		
		rd.forward(request, response);
	}
}
