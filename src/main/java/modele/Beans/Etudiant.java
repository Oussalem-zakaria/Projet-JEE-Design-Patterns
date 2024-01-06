package modele.Beans;

public class Etudiant {

	private String nom;
	private String prenom;
	private String cne;

	public Etudiant() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCNE() {
		return cne;
	}

	public void setCNE(String CNE) {
		this.cne = CNE;
	}

	@Override
	public String toString() {
		return "Etudiant [nom:" + nom + ", prenom:" + prenom + ", CNE:" + cne + "]";
	}

}
