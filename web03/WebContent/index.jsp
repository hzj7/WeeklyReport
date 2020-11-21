<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My First Jsp Page</title>
</head>
	<body>
		<h1 align = "center">我是你爹</h1>
		<%
			String str = "Abc";
			System.out.println("Abc");
		%>
		
		<%=5>3?"大于":"小于" %>
		<br/>
		<a href = "CookieServlet">Test Cookie</a>
	</body>
</html>