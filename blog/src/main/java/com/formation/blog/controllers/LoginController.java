package com.formation.blog.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.formation.blog.models.User;
import com.formation.blog.services.UserService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	       
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		 User user = new User();
	       user.setEmail(request.getParameter("email"));
	       user.setMdp(request.getParameter("mdp"));
	       
	       UserService userService = new UserService();
	       User u = userService.findByID(user.getEmail());
	       if (u == null || !user.getMdp().equals(u.getMdp())) {
	    	   request.setAttribute("user", user);
	    	   doGet(request, response);
	       }else {
	    	   request.getSession().setAttribute("user", u);
	    	   response.sendRedirect(request.getContextPath() + "/");
	       }
	}

}
