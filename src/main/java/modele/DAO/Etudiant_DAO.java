package modele.DAO;

import java.util.ArrayList;

import modele.Beans.Etudiant;

public interface Etudiant_DAO {
	ArrayList<Etudiant> findAll();
	Etudiant findByCNE(String CNE);
	void insert(Etudiant etd);
	int update(Etudiant etd, String CNE);

	void deleteByCNE(String CNE);
}

