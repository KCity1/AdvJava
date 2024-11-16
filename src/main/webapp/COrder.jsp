<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String password="";
	String Email="";
	boolean emailcheck=false;
	boolean passwordcheck=false;
	Cookie[] c = request.getCookies();
	if (c != null) {
		for (Cookie cookies : c) {
			if (cookies.getName().equals("Email")) {
				if (!cookies.getValue().trim().isEmpty()) {
					emailcheck=true;
					Email=cookies.getValue();
				}
			}
			if (cookies.getName().equals("Password")) {
				if (!cookies.getValue().trim().isEmpty()) {
					passwordcheck=true;
					password=cookies.getValue();
				}
			}
		}
		if(emailcheck && passwordcheck)
		{
			%>
				<h1>Welcome order</h1>
			<%
		} 
		else {
			response.sendRedirect("cLogin.jsp");
		}
	}
	%>
</body>
</html>