package controleur;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import Composite.Emplacement;
import methodeFactory.concret.batiment.classes.Classe;
import modele.Departement;

/**
 * Servlet implementation class Composite
 */
@WebServlet("/mediateur")
public class mediateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String test = "/vues/mediateur.jsp";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public mediateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(test).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Ok :::");
		String[] selectedChefs = request.getParameterValues("chefs");

		if (selectedChefs != null) {
			for (String chef : selectedChefs) {
				System.out.println(chef);
			}
		}
		request.setAttribute("message", "mediateur added successfully");
		request.setAttribute("chefs", selectedChefs);
		request.setAttribute("mediateur", request.getParameter("mediateur"));
		
		this.getServletContext().getRequestDispatcher(test).forward(request, response);
	}

}