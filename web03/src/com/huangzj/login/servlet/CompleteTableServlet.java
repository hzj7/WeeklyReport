package com.huangzj.login.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huangzj.login.dao.StudentDao;
import com.huangzj.login.dao.StudentDaoImpl;
import com.huangzj.login.dao.UserDao;

public class CompleteTableServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String stu_name = req.getParameter("stu_name");
		String workInThisWeek = req.getParameter("workInThisWeek");
		String workInNextWeek = req.getParameter("workInNextWeek");
		String explaination = req.getParameter("explaination");
		String loginDate = req.getParameter("loginDate");
		StudentDao stu = new StudentDaoImpl();
		
		stu.insertStudent(stu_name, workInThisWeek, workInNextWeek, explaination, loginDate);
		resp.sendRedirect("WeeklyReport.jsp");
	}
}
