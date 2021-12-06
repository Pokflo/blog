package com.formation.blog.controllers;

import com.formation.blog.models.User;
import com.formation.blog.services.UserService;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Servlet implementation class InscritionServlet
 */
@WebServlet("/Inscription")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/Inscription.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String mdp = request.getParameter("mdp");
		String mdp2 = request.getParameter("mdp2");
		String jour = request.getParameter("jour");
		String mois = request.getParameter("mois");
		String annee = request.getParameter("annee");

		if (mdp.equals(mdp2)) {
			User user = new User();
			user.setEmail(email);
			user.setMdp(mdp);
			user.setNom(nom);
			user.setPrenom(prenom);
			try {
				user.setNaissance(this.stringToDate(jour, mois, annee));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			user.setRole(0);
			new UserService().insert(user);
		} else {
			doGet(request, response);
		}
	}

	public Date stringToDate(String jour, String mois, String annee) throws ParseException {
		System.out.println(jour + "-" + mois + "-" + annee);
		return new SimpleDateFormat("dd-MM-yyyy")
				.parse(jour + "-" + mois + "-" + annee);
	}
}
