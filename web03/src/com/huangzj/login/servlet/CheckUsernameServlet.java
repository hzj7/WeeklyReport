package com.huangzj.login.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huangzj.login.beans.User;
import com.huangzj.login.dao.UserDao;
import com.huangzj.login.dao.UserDaoImpl;

public class CheckUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CheckUsernameServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取用户名
		String username = request.getParameter("username");
		
		UserDao userDao = new UserDaoImpl();
		
		User user = userDao.getUserByUsername(username);
		
		String msg = "";
		if(user == null) {
			//可用
			msg = "用户名可以使用";
		}else {
			//不可用
			msg = "用户名已存在,请更换";
		}
		response.setContentType("text/html;charset=utf-8");
		
		response.getWriter().println(msg);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

//这个其实没啥用  但是要用到EL表达式  我这个EL表达式用不了  不知道为啥
