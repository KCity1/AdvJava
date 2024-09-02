package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputTwoNumServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		int num1 = Integer.parseInt(request.getParameter("n1"));
		int num2 = Integer.parseInt(request.getParameter("n2"));
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		if (num1 > num2) {
			out.print("<h1>" + num1 + " > " + num2 + "<h1>");
		} else {
			out.print("<h1>" + num2 + " > " + num1 + "<h1>");
		}
	}
}
