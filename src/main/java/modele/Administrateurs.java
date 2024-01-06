package modele;
import abstractFactory2.AbstractUser;


public class Administrateurs extends Personnel implements AbstractUser{

	@Override
	public void introduce() {
		System.out.println("I am an administrator.");
	}

}
