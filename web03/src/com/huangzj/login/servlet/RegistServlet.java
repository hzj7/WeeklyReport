package com.huangzj.login.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huangzj.login.beans.User;
import com.huangzj.login.dao.UserDao;
import com.huangzj.login.dao.UserDaoImpl;

public class RegistServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		UserDao userDao = new UserDaoImpl();
		
		User user = userDao.getUserByUsername(username);
		if(user!=null) {
			req.setAttribute("regist_msg", "用户名已存在");
			req.getRequestDispatcher("regist.jsp").forward(req, resp);
			
		}else {
			userDao.insertUser(username, password);
			resp.sendRedirect("login.jsp");
		}
	}

}
