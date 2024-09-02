package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveProductServlet")
public class SaveProductServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("Name");
		String Price = request.getParameter("Price");
		String category = request.getParameter("category");
		String qty = request.getParameter("qty");
		
		//connection and inserting data!
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/24advjavagenmon6tue5", "root",
					"VidhitAgrawal");
			PreparedStatement pstmt = con.prepareStatement(
					"insert into product(productName,price,category,qty) values (?,?,?,?)");
			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(Price));
			pstmt.setString(3, category);
			pstmt.setInt(4, Integer.parseInt(qty));
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("ListProductServlet").forward(request, response);;
	}
}
