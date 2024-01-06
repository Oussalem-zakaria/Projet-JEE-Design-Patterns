package modele;

import Composite.Emplacement;

public abstract class Batiment extends Emplacement {

	private String genre;
	private String emplacement;
	private String description;

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Batiment(String genre) {
		this.genre = genre;
	}
	
	public Batiment() {
	}

	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getEmplacement() {
		return emplacement;
	}

	
	public String getDescription() {
		return description;
	}
	
	@Override
	public void getinfos() {
		String str="";
        for(int i=0;i<this.getNiveau();i++){
            str+="---";
        }
        System.out.println(str+"Batimant "+name+" numero "+getId());
	}

	public abstract void afficheBatiment();
	
	public abstract void organiser(String description,int id);

	@Override
	public String toString() {
		String className = this.getClass().getName();
		return className + " --> C'est le Batiment : " + genre;
	}
}
