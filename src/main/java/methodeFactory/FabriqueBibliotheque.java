package methodeFactory;

import methodeFactory.concret.batiment.classes.Bibliotheque;
import modele.Batiment;

public class FabriqueBibliotheque implements FabriqueBatiment{

	@Override
	public Batiment creerBâtiment() {
		return new Bibliotheque();
	}

}
