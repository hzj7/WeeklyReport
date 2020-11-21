package com.huangzj.login.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ªÒ»°cookie
		Cookie [] cookies = request.getCookies();
		if(cookies!=null) 
		{
			for(Cookie cookie : cookies) 
			{
				System.out.println(cookie.getName() + ":" + cookie.getValue());
			}
		}
		else 
		{
			System.out.println("NoCookie");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
