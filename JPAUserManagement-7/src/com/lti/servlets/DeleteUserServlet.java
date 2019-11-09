package com.lti.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.models.Users;
import com.lti.service.UserServiceImpl;


public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		UserServiceImpl service = new UserServiceImpl();
		boolean result=service.removeUser(username);
		
		/*if(result)
		{
			List<Users> users = service.findAllUsers();
			request.setAttribute("UsersList", users);
		}*/
		
		if(result)
		{
			RequestDispatcher rd = request.getRequestDispatcher("showUsers.view");
			rd.forward(request, response);
		}
	}

}
