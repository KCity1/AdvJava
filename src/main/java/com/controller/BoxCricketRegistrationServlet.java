package com.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BoxCricketRegistrationServlet")
public class BoxCricketRegistrationServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String FirstName = request.getParameter("StuNme");
		String PlayerType = request.getParameter("PlayerType");
		Boolean isError = false;
		if (FirstName == null || FirstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("FirstNameError", "First Name Not Enterd");
		} else {
			String NameRegEx = "[a-zA-Z]{2,}";
			if (FirstName.matches(NameRegEx) == false) {
				isError = true;
				request.setAttribute("FirstNameError", "First Name Not Enterd Right");
			}
		}
		if (PlayerType == null || PlayerType.trim().length() == 0) {
			isError = true;
			request.setAttribute("PlayerTypeError", "Player Type Not Enterd");
		}

		if (isError == true) {
			request.setAttribute("StudentNameValue", FirstName);
			request.setAttribute("StudentSkillValue", PlayerType);
			RequestDispatcher rd = request.getRequestDispatcher("BoxCricketRegistration.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("BoxCricketRegistrationSuccess.jsp");
			rd.forward(request, response);
		}

	}
}
