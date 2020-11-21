<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>填写信息</title>
</head>
<body bgcolor = "orange">
<h1>请填写表格</h1>
<form action = "complete_table" method = "post">
	请输入名称:<input type ="text" name = "stu_name"/>
	<br/>
	<br/>
	请输入本周完成的事项:<input type =text" name = "workInThisWeek"/>
	<br/>
	<br/>
	请输入下周预定完成的事项:<input type ="text" name = "workInNextWeek"/>
	<br/>
	<br/>
	请输入综合说明:<input type =text" name = "explaination"/>
	<br/>
	<br/>
	请输入填写时间(格式:2001/1/1):<input type =text" name = "loginDate"/>
	<br/>
	<br/>
	<input type = "submit" value = "Complete" />
</form>
<br/>
<br/>
<a href = "WeeklyReport.jsp"><h1 color:blue align = "right">点击返回主界面</h1></a>
</body>
</html>