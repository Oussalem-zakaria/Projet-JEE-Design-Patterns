package methodeFactory.concret.batiment.classes;

import modele.Batiment;

public class Amphis extends Batiment{

	public Amphis() {
		super();
	}

	@Override
	public void afficheBatiment() {
		System.out.println("Amphis");
	}

	@Override
	public void organiser(String description, int id) {
		setGenre(description);
		setDescription("C'est une "+this.getDescription()+"adapter pour l'organisation de l'evenment "+description+" numero  : "+id);
	}

}
