<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WeeklyReport</title>
</head>
<body>
	<h1 align = "center"><b><i>WeeklyReport</i></b></h1>
	<br>
	<br>
	<br>
	<hr>
	<hr>
	<h3>填写本周进度</h3>
	<form action = "fill" method = "post">
		<input type = "submit" value = "输入本周内容">
	</form>
	<br>
	<br>
	<br>
	<hr>
	<hr>
	<h3>查看之前的内容</h3>
	<form action = "check"  method = "post">
		<input type = "submit" value = "查看个人内容">
	</form>
	<br>
	<br>
	<a href = "login.jsp"><h1 color:blue align = "right">返回登陆界面</h1></a>
	

</body>
</html>