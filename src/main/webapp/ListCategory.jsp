<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr>
			<th>productId</th>
			<th>productName</th>
			<th>price</th>
			<th>category</th>
			<th>qty</th>
		</tr>
		<%
		ResultSet rs = (ResultSet) request.getAttribute("rs");
		while (rs.next()) {
			int productId = rs.getInt("productId");
			String productName = rs.getString("productName");
			int price = rs.getInt("price");
			String category = rs.getString("category");
			int qty = rs.getInt("qty");
		%>
		<tr>
			<td><%=productId%></td>
			<td><%=productName%></td>
			<td><%=price%></td>
			<td><%=category%></td>
			<td><%=qty%></td>
		</tr>
		<%
		}
		%>

	</table>

</body>
</html>