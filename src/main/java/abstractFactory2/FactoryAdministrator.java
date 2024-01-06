package abstractFactory2;

public class FactoryAdministrator implements AbstractFactory{

	@Override
	public AbstractUser getInstance() {
		return new Administrator();
	}

}
