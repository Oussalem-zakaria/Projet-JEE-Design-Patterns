package abstractFactory2;

public class Application {
	public static void main(String[] args) {
		
		String identifiant = "enseignant";
		AbstractFactory abstractFactory;
		abstractFactory = switch (identifiant.toLowerCase()) {
		case "etudiant" -> new FactoryStudent();
		case "enseignant" -> new FactoryTeacher();
		case "administrateurs" -> new FactoryAdministrator();
		default -> throw new IllegalArgumentException("Unexpected value: " + identifiant);
		};
		AbstractUser abstractUser=abstractFactory.getInstance();
		abstractUser.introduce();
	}
}
