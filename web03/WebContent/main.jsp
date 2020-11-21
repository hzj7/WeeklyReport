<%@page import="java.util.List"%>
<%@page import="com.huangzj.login.beans.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align = "center">欢迎  <font color = "blue">${sessionScope.loginUser.username }</font> 登录</h1>
	<br/>
	<br/>
	<h2 align ="center">个人内容</h2>
	<table border = "1px" width ="70%" align = "center" cellspacing = "0px">
		<tr>
			<th>姓名</th>
			<th>本周完成事项</th>
			<th>下周预定完成事项</th>
			<th>综合说明</th>
			<th>登入日期</th>
		</tr>
	<c:forEach items="${emps}" var="emp">
		<tr align = "center">
			<td>${emp.stu_name}</td>
			<td>${emp.workInThisWeek}</td>
			<td>${emp.workInNextWeek}</td>
			<td>${emp.explaination}</td>
			<td>${emp.loginDate}</td>
		</tr>
	</c:forEach>
</table>
<a href = "WeeklyReport.jsp"><h1 color:blue align = "right">点击返回主界面</h1></a>	
</body>
</html>