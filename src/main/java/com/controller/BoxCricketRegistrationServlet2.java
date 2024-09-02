package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BoxCricketRegistrationServlet2")
public class BoxCricketRegistrationServlet2 extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String name = request.getParameter("StudentName");
		String Skill = request.getParameter("StudentSkill");

		Boolean isError = false;
		if (name == null || name.trim().length() == 0) {
			isError = true;
			request.setAttribute("NameError", "Please Enter Valid Name Field");
		} else {
			// if Name String is Entered 
			String NameRegEx = "[a-zA-Z]{2,}";
			if(name.matches(NameRegEx)==false)
			{
				isError = true;
				request.setAttribute("NameError", "Please Enter Valid Name Field");
			}
		}		
		if (Skill == null || Skill.trim().length() == 0) {
			isError = true;
			request.setAttribute("SkillError", "Please Enter Skill Field");
		}

		if (isError) {
			// Error -> back to Request JSP 
			request.setAttribute("StudentSkillValue",Skill);
			request.setAttribute("StudentNameValue",name);
			RequestDispatcher rd = request.getRequestDispatcher("BoxCricketRegistration2.jsp");
			rd.forward(request, response);
		} else {
			// Success -> Respond to Success JSP
			RequestDispatcher rd = request.getRequestDispatcher("BoxCricketRegistrationSuccess.jsp");
			rd.forward(request, response);
		}

	}
}
