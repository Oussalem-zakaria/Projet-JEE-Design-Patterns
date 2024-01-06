package methodeFactory.concret.batiment.classes;

import modele.Batiment;

public class Classe extends Batiment {

	public Classe() {
		super();
	}

	@Override
	public void afficheBatiment() {
		System.out.println("Les classes");
	}

	@Override
	public void organiser(String description, int id) {
		setGenre(description);
		setDescription("C'est une "+this.getDescription()+"adapter pour l'organisation de l'evenment "+description+" numero  : "+id);
	}

}
