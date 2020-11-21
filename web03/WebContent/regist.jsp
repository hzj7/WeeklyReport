<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
		<style>
			body{
				background-color:grey;
			}
			span{
				color:red;
			}
		</style>
<title>Insert title here</title>

<!-- 
<script type = "text/javascript">
	//获取xhr对象  使用异步方法
	function getXhr(){
		var xhr = new XMLHttpRequest();
//		alert(xhr);
		return xhr;
	}
	
	function checkUsername(){
		//获取用户输入的用户名.
		var username = document.getElementById("username").value;
		//发送异步请求进行校验
		var xhr = getXhr();
		//设置请求信息
		xhr.open("get","checkUsername?username="+username,true);
		//发送请求
		xhr.send();
		//监听readyState的状态,直到请求结束
		xhr.onreadystatechange=function(){   //匿名函数
			if(xhr.readyState == 4){           //响应处理完成
 				if(xhr.status == 200){          //处理正确
 					//获取服务端响应回来的数据
 					var msg = xhr.responseText;
 					//将信息显示到用户名输入框后面
 					document.getElementById("regist_span").innerHTML = msg ;
 				}
			}
		}
	}
	
</script>                             -->
</head>
<body>
	<h1>欢迎注册</h1>
	<form action = "regist" method = "post">
		用户名称:<input type = "text" id = "username" name = "username" onblur = "checkUsername();"/>
		<%
			String RegistMsg = (String)request.getAttribute("regist_msg");
		%>
				<span id = "regist_span"><%=RegistMsg==null?"":RegistMsg %></span>
		<br/>
		用户密码:<input type = "text" name = "password"/>
		<br/>
		<input type = "submit" value = "注册"/>
	</form>
	
	
	<!--  <input type = "button" value = "测试xhr对象" onclick = "getXhr();">   -->

</body>
</html>