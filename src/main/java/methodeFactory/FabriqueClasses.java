package methodeFactory;

import methodeFactory.concret.batiment.classes.Classe;
import modele.Batiment;

public class FabriqueClasses implements FabriqueBatiment{

	@Override
	public Batiment creerBâtiment() {
		return new Classe();
	}

}
