package abstractFactory2;

import modele.Etudiant;

public class FactoryStudent implements AbstractFactory{

	@Override
	public AbstractUser getInstance() {
		return new Etudiant();
	}

}
