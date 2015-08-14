package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("passoword");
		
		if("itcast".equalsIgnoreCase(username))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("/test/session2/succ1.jsp");
		}else{
			request.setAttribute("msg", "用户名或密码错误");
			RequestDispatcher qr = request.getRequestDispatcher("/session2/login.jsp");
			qr.forward(request, response);
		}
	}
}
