<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Products</title>
</head>
<body>
	<h1>List Of Products</h1>
	<table border="2px solid black">
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Category</th>
			<th>Price</th>
			<th>Quantity</th>
		</tr>
		<%
		ResultSet rs = (ResultSet) request.getAttribute("rs");
		while (rs.next()) {
			out.print("<tr>");
			String productId = rs.getString("productId");
			String name = rs.getString("productName");
			String category = rs.getString("category");
			int price = rs.getInt("price");
			int qty = rs.getInt("qty");
		%>
		<tr>
			<td><%=productId%></td>
			<td><%=name%></td>
			<td><%=category%></td>
			<td><%=price%></td>
			<td><%=qty%></td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>