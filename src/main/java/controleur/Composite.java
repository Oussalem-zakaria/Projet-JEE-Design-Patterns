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
@WebServlet("/Composite")
public class Composite extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String test = "/vues/composite.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Composite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Departement dep=new Departement("Siences ",1);
        Emplacement bat=new Classe();
        Emplacement bat2=new Classe();
        bat.setId(15);
        bat2.setId(6);
        bat2.setName("Salle TD");
        bat.setName("Salle de cours");
        Departement depPhy=new Departement("depPhy",2);
        Emplacement depSVT=new Departement("depSVT",3);

        Departement depMathInfos=new Departement("depMathInfos",4);
        Departement info=new Departement("depinfo",41);
        Emplacement math=new Departement("depMath",42);
        
        dep.addEmplacements(depPhy);
        depPhy.addEmplacements(bat2);
        dep.addEmplacements(depSVT);
        dep.addEmplacements(depMathInfos);
        depMathInfos.addEmplacements(info);
        info.addEmplacements(bat);
        depMathInfos.addEmplacements(math);
        
//        dep.getinfos();
        
        request.setAttribute("results", dep);
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
