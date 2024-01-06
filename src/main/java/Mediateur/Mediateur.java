package Mediateur;

import java.util.HashMap;

public abstract class Mediateur {
	// list of ChefDepartement
	HashMap<Integer, ChefDepartement> chefDepartements;

	public Mediateur() {
		chefDepartements = new HashMap<Integer, ChefDepartement>();
	}

	abstract void transmettreMessage(Message message);

	abstract void addChefDepartement(ChefDepartement ch);
}