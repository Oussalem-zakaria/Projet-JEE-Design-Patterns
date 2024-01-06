package methodeFactory;

import methodeFactory.concret.batiment.classes.Amphis;
import modele.Batiment;

public class FabriqueAmphis implements FabriqueBatiment{

	@Override
	public Batiment creerBâtiment() {
		return new Amphis();
	}

}
