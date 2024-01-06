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
//@WebServlet(name = "addDepartemat", urlPatterns = "/addDepartemat")
@WebServlet("/addPersonnel")
public class Test4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String test = "/vues/addPersonnel.jsp";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Etudiant> batimants = null;
		request.setAttribute("batimants", batimants);
		this.getServletContext().getRequestDispatcher(test).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
