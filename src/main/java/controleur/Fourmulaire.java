package controleur;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Fourmulaire
 */

@WebServlet(name = "adduser", urlPatterns = "/addUser")
public class Fourmulaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String FORMULAIRE = "/vues/formulaire.jsp";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Fourmulaire() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String btnName = "Submit", title = "Add User";
		request.setAttribute("btnName", btnName);
		request.setAttribute("title", title);
		this.getServletContext().getRequestDispatcher(FORMULAIRE).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
