package methodeFactory;

import modele.Batiment;

public class Application {
	public static void main(String[] args) {
		FabriqueBatiment fb,fb2;

		String genre = "bibliotheque";
		String genre2 = "classe";

		fb = switch (genre.toLowerCase()) {
			case "classe" -> new FabriqueClasses();
			case "amphis" -> new FabriqueAmphis();
			case "administration" -> new FabriqueAdministration();
			case "bibliotheque" -> new FabriqueBibliotheque();
			default -> throw new IllegalArgumentException("Type de bâtiment inconnu : " + genre);
		};
		
		fb2 = switch (genre2.toLowerCase()) {
		case "classe" -> new FabriqueClasses();
		case "amphis" -> new FabriqueAmphis();
		case "administration" -> new FabriqueAdministration();
		case "bibliotheque" -> new FabriqueBibliotheque();
		default -> throw new IllegalArgumentException("Type de bâtiment inconnu : " + genre);
	};
		
		Batiment b = fb.creerBâtiment();
		b.setGenre(genre);
		b.setDescription("Batimet resirver pour les "+genre);
		b.setEmplacement("Block A");
		b.afficheBatiment();
		
		Batiment b2 = fb2.creerBâtiment();
		b2.setGenre(genre);
		b2.setDescription("Batimet resirver pour les "+genre);
		b2.setEmplacement("Block A");
		b2.afficheBatiment();

	}
}
