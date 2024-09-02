package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Category = request.getParameter("category");
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/24advjavagenmon6tue5";
		String userName = "root";
		String password = "VidhitAgrawal";
		try {
			
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url, userName, password);
			PreparedStatement pstm = con.prepareStatement("Select * from product where category = ?");
			pstm.setString(1, Category);
			ResultSet rs = pstm.executeQuery();
			System.out.println("Category Found!");
			request.setAttribute("rs", rs);
			request.getRequestDispatcher("ListCategory.jsp").forward(request, response); 
		}
		catch(Exception e)
		{
			System.out.println("False: Something Went Wrong");
			e.printStackTrace();
		}
	}
}
