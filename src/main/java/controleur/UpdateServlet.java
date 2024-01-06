package controleur;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modele.Beans.Etudiant;
import modele.DAO.Etudiant_DAO_JDBC;

@WebServlet("/updateuser")
public class UpdateServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String FORMULAIRE = "/vues/formulaire.jsp";
	private static final String RESULTAT = "/vues/resultat.jsp";
	Etudiant_DAO_JDBC dao_JDBC = new Etudiant_DAO_JDBC();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String btnName = "Update", title = "Update User";
		request.setAttribute("btnName", btnName);
		request.setAttribute("title", title);
		Etudiant etd = dao_JDBC.findByCNE(request.getParameter("CNE"));
		request.setAttribute("etudiant", etd);
		System.out.println(etd.toString());
		this.getServletContext().getRequestDispatcher(FORMULAIRE).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String msg;
		Etudiant etd = new Etudiant();
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String CNE = request.getParameter("CNE");

		// Vérifier des champs du formulaire
		if (nom.trim().isEmpty() || prenom.trim().isEmpty() || CNE.trim().isEmpty()) {
			msg = "Erreur - <a href=" + FORMULAIRE
					+ ">Cliquez ici</a> pour accéder au formulaire de création d'un étudiant.";
		} else {
			// Modifier l'objet Etudiant
			etd.setNom(nom);
			etd.setPrenom(prenom);
			etd.setCNE(CNE);
			int result = dao_JDBC.update(etd, CNE);
			if (result > 0) {
				msg = "Etudiant modifiée avec succès !";
				// Modifier les valeurs des paraméres
				request.setAttribute("etudiant", etd);
				request.setAttribute("message", msg);
				// Envoyer les infos vers resultat
				afficherResultat(request, response);
			} else {
				this.getServletContext().getRequestDispatcher(FORMULAIRE).forward(request, response);
			}
		}

	}

//Méthode qui permet la communication controleur-vue
	private void afficherResultat(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(RESULTAT).forward(req, resp);
	}
}