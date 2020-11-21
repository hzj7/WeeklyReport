package com.huangzj.login.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("��ǰ�����request����:"+ request);
		
		//��ȡsession����
		HttpSession session = request.getSession();
		System.out.println("��ǰ�����session����:" + session);
		System.out.println("sessionID:" + session.getId());
		System.out.println("====================================");
		response.getWriter().println("success");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
