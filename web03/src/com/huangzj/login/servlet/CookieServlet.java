package com.huangzj.login.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//演示Cookie
		Cookie cookie = new Cookie("username","Admin");
		//保存到浏览器端
		response.addCookie(cookie);
		//cookie的默认时效就是在当前浏览器的内存中,只要浏览器一关,就相当于浏览器释放内存,就没有了
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
