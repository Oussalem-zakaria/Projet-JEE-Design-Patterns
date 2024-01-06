package abstractFactory2;

public class Administrator implements AbstractUser{

	@Override
	public void introduce() {
		System.out.println("I am Administrator");
	}

}
