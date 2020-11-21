	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset ="utf-8">
		<style>
		
			body{
				background-color:green;
			}
			span{
				color:red;
			}
		</style>
	</head>
	
	<body bgcolor = "green">
		<h1>欢迎登陆</h1>
			<form action = "login" method ="post">
				用户名称:<input type="text" name = "username"/>
				<%
					String loginMsg = (String)request.getAttribute("login_msg");
				%>
				<span><%=loginMsg==null?"":loginMsg %></span>
				<br/>
				用户密码:<input type ="password" name = "password"/>
				<br/>
				<input type = "submit" value = "Login" />
				<br/>
				<a href = "regist.jsp"><h1>点击此处注册</h1></a>
			</form>
	</body>

</html>