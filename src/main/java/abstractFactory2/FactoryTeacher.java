package abstractFactory2;

import modele.Enseignant;

public class FactoryTeacher implements AbstractFactory{

	@Override
	public AbstractUser getInstance() {
		return new Enseignant();
	}

}
