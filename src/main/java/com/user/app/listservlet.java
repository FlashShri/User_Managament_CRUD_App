package com.user.app;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.dao.UserDao;


/**
 * Servlet implementation class listservlet
 */

 
@WebServlet("/listservlet")
public class listservlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 UserDao dao = new UserDao();
		
	 List<com.user.model.User> list = dao.fetchAllUser();
	 
	 request.setAttribute("userlist", list);
	 
	 request.getRequestDispatcher("list.jsp").forward(request, response);
		
	}

}