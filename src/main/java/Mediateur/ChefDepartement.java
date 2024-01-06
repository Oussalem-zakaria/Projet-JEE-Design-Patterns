package Mediateur;

import modele.Personnel;

public class ChefDepartement extends Personnel {
	private Mediateur mediateur;
	
	public ChefDepartement(Mediateur mediateur) {
		this.mediateur = mediateur;
	}

	public void envoyerMessage(Message m) {
		System.out.println("Nom: "+this.getNom());
		System.out.println("Envoi du message vers: "+m.getDestinaire().getNom());
		m.expediteur = this;
		mediateur.transmettreMessage(m);
	}
	
	public void recevoireMessage(Message m) {
		System.out.println("Je suis "+this.getNom()+" ,j'ai bien recu le message");
		System.out.println("Contenu: "+m.getContenu());
		System.out.println("Expéditeur: "+m.getExpediteur().getNom());
		System.out.println("------------------------------");
	}
}
