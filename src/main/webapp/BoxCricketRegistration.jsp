<%@page import="java.awt.dnd.DropTargetAdapter"%>
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
		String name = (String)request.getAttribute("FirstNameError");
		String Player = (String)request.getAttribute("PlayerTypeError");
		
		String StudentNameValue = (String)request.getAttribute("StudentNameValue");
		String StudentSkillValue = (String)request.getAttribute("StudentSkillValue");
	%>
	<form action="BoxCricketRegistrationServlet" method="post">
		<h1>Box Cricket Registration</h1>
		<br><br>
		Student Name: <input type="text" name="StuNme" value="<%=StudentNameValue==null?"":StudentNameValue%>"><%=name == null ? "" : name %>
		
		<br><br>
		Player Type : 
		<select name="PlayerType">
			<option value="">Please Select your Skill</option>
			<option value="Batting" <%=StudentSkillValue!=null&&StudentSkillValue.contains("Batting")?"selected":"" %>>Batting</option>
			<option value="Bowling" <%=StudentSkillValue!=null&&StudentSkillValue.contains("Bowling")?"selected":"" %>>Bowling</option>
			<option value="Viewing" <%=StudentSkillValue!=null&&StudentSkillValue.contains("Viewing")?"selected":"" %>>Viewing</option>
		</select><%=Player == null ? "" :Player  %>
		<br><br>
		<input type="submit" value="Register">
	</form>
</body>
</html>