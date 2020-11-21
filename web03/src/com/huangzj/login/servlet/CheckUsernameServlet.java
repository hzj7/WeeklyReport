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
		//��ȡ�û���
		String username = request.getParameter("username");
		
		UserDao userDao = new UserDaoImpl();
		
		User user = userDao.getUserByUsername(username);
		
		String msg = "";
		if(user == null) {
			//����
			msg = "�û�������ʹ��";
		}else {
			//������
			msg = "�û����Ѵ���,�����";
		}
		response.setContentType("text/html;charset=utf-8");
		
		response.getWriter().println(msg);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

//�����ʵûɶ��  ����Ҫ�õ�EL���ʽ  �����EL���ʽ�ò���  ��֪��Ϊɶ
