package modele;

public abstract class Personnel {

	private int id;
	private String nom;
	private String prenom;
	private String fonction;
	private String identifiant;
	private int departement;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDepartement() {
		return departement;
	}

	public void setDepartement(int departement) {
		this.departement = departement;
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

	public void setPrenom(String prénom) {
		this.prenom = prénom;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "[id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", fonction="
				+ fonction + ", identifiant=" + identifiant + ", departement=" + departement + "]";
	}

}
