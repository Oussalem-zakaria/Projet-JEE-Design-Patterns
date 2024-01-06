package controleur;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modele.Beans.Etudiant;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Servlet implementation class Test
 */
@WebServlet("/adaptateur")
public class Test5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String test = "/vues/adaptateur.jsp";
	private static final String FORMULAIRE = "/vues/AddBatimant.jsp";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Test5() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Etudiant> batimants = null;
		request.setAttribute("batimants", batimants);
		this.getServletContext().getRequestDispatcher(test).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String event = (String) request.getParameter("event");
		request.setAttribute("event", event);
		this.getServletContext().getRequestDispatcher("/test").forward(request, response);
	}

}
