package com.huangzj.login.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.LifecycleListener;

import com.huangzj.login.beans.Student;
import com.huangzj.login.beans.User;
import com.huangzj.login.dao.StudentDao;
import com.huangzj.login.dao.StudentDaoImpl;
import com.huangzj.login.dao.UserDao;
import com.huangzj.login.dao.UserDaoImpl;


public class LoginServlet extends HttpServlet{
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("成功登陆...");
		req.setCharacterEncoding("utf-8");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(username + "," + password);
		
		resp.setContentType("text/html;charset = utf-8");
		PrintWriter out = resp.getWriter();
		
		UserDao userDao = new UserDaoImpl();
		
		User user = userDao.getUserByUsernameAndPassword(username, password);
		
		if(user == null) {
			req.setAttribute("login_msg", "用户名或者密码错误");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);
			
		}else {
			//登录用户设置到session中
			HttpSession session = req.getSession();
			session.setAttribute("loginUser", user);
			//查找所有的员工数据
			StudentDao studentDao = new StudentDaoImpl();
			List<Student> emps = studentDao.selectAllEmps();
			
			session.setAttribute("emps", emps);
			req.getRequestDispatcher("WeeklyReport.jsp").forward(req, resp);
		}
	}
}
