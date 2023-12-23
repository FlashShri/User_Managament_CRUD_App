package com.user.app;

import java.io.IOException;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.dao.UserDao;
import com.user.model.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  request.getParameter("name");
		  
		  User newuser = new User(
				  
				  request.getParameter("name"),
				  request.getParameter("email"),
				  request.getParameter("password"),
				  request.getParameter("country")
				  );
		  
		  System.out.println( newuser.getName());
		  
		  UserDao dao = new UserDao();
		   if(dao.insertUser(newuser)) {
			   response.sendRedirect("index.jsp");
		   }else {
			   response.sendRedirect("registeruser.jsp");
		   }

		
	}

}
