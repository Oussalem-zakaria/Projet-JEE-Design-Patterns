package Mediateur;

public class Message {

	String contenu;
	ChefDepartement expediteur;
	ChefDepartement destinaire;
	
	public String getContenu() {
		return contenu;
	}
	
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public ChefDepartement getExpediteur() {
		return expediteur;
	}

	public void setExpediteur(ChefDepartement expediteur) {
		this.expediteur = expediteur;
	}

	public ChefDepartement getDestinaire() {
		return destinaire;
	}

	public void setDestinaire(ChefDepartement destinaire) {
		this.destinaire = destinaire;
	}
	
	@Override
	public String toString() {
		return "Message [contenu=" + contenu + ", expediteur=" + expediteur + ", destinaire=" + destinaire + "]";
	}
	
}
