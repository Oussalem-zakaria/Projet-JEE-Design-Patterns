package modele;

import java.util.Map;

import abstractFactory2.AbstractUser;

public class Etudiant implements AbstractUser {
	private String nom;
	private String prenom;
	private String code;
	private String situation_scolaire;
	private int section_id;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSituation_scolaire() {
		return situation_scolaire;
	}

	public void setSituation_scolaire(String situation_scolaire) {
		this.situation_scolaire = situation_scolaire;
	}

	public int getSection_id() {
		return section_id;
	}

	public void setSection_id(int section_id) {
		this.section_id = section_id;
	}

	@Override
	public void introduce() {
		System.out.println("I am a student.");
	}

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", code=" + code + ", situation_scolaire="
				+ situation_scolaire + ", section_id=" + section_id + "]";
	}


}
