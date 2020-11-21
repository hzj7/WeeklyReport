package com.huangzj.login.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.huangzj.login.beans.Student;
import com.huangzj.login.dao.StudentDao;
import com.huangzj.login.dao.StudentDaoImpl;

public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		StudentDao studentDao = new StudentDaoImpl();
		List<Student> emps = studentDao.selectAllEmps();
		session.setAttribute("emps", emps);
		resp.sendRedirect("main.jsp");
	}

}
