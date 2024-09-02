package com.util;

import java.sql.*;

public class DbConnection {
	public static void main(String[] args) {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/24advjavagenmon6tue5";
		String userName = "root";
		String password = "VidhitAgrawal";

		try {
			// load Driver
			Class.forName(driverName);
			// open DbConnection
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("connection => " + con);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
