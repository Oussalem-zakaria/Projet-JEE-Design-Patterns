package methodeFactory;

import methodeFactory.concret.batiment.classes.Administration;
import modele.Batiment;

public class FabriqueAdministration implements FabriqueBatiment{

	@Override
	public Batiment creerBâtiment() {
		return new Administration();
	}

}
