package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServlet2")
public class CalcServlet2 extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String num1 = request.getParameter("numb1");
		String num2 = request.getParameter("numb2");
		int sum = 0;
		String opp = request.getParameter("Operation"), operation = "";
		PrintWriter out = response.getWriter();

		if (num1 == null || num2 == null || opp == null) {
			out.print("Please Enter All Information!!");
		} else {
			int x = Integer.parseInt(num1);
			int y = Integer.parseInt(num2);

			if (opp.equals("+")) {
				sum = x + y;
				operation = "Addition";
			} else if (opp.equals("-")) {
				sum = x - y;
				operation = "Subtraction";
			} else if (opp.equals("*")) {
				sum = x * y;
				operation = "Multiplication";
			} else if (opp.equals("/")) {
				sum = x / y;
				operation = "Division (num1/num2)";
			}
			out.print("<h1>" + operation + ":" + " " + sum + "</h1>");
		}

	}
}
