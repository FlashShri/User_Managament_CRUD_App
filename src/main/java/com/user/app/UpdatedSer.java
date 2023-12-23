package com.user.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.dao.UserDao;
import com.user.model.User;

/**
 * Servlet implementation class UpdatedSer
 */
@WebServlet("/UpdatedSer")
public class UpdatedSer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		UserDao dao = new UserDao();
		
		boolean flag=   dao.updateUser(  new User(
				Integer.parseInt(request.getParameter("id")),
				request.getParameter("name"),
				request.getParameter("email"),
				request.getParameter("password"),
				request.getParameter("country")
				));
		
		if( flag) {
			response.sendRedirect("index.jsp");
		}
	}

}
