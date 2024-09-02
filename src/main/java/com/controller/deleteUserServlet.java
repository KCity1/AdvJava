package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteUserServlet")
public class deleteUserServlet extends HttpServlet{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productName =  request.getParameter("productName");
		System.out.println("Product Name:"+productName);
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/24advjavagenmon6tue5";
		String userName = "root";
		String password = "VidhitAgrawal";
		
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url, userName, password);
			PreparedStatement pstm = con.prepareStatement("delete from product where productName = ?");
			pstm.setString(1, productName);
			pstm.executeUpdate();
			request.getRequestDispatcher("ListProductServlet").forward(request, response);
			System.out.println("Deleted Successfully");
		} catch (Exception e) {
			System.out.println("Something went Wrong..Deleteing the Quary");
			e.printStackTrace();
		}
	}

}
