package Mediateur;

public class Main {

	public static void main(String[] args) {
		Mediateur mediateurInfo=new MediatorInfo();
		ChefDepartement omar = new ChefDepartement(mediateurInfo);
		omar.setNom("Omar"); omar.setId(1); omar.setFonction("Chef 2IAD");
		
		ChefDepartement mohmad = new ChefDepartement(mediateurInfo);
		mohmad.setNom("mohmad"); mohmad.setId(2); mohmad.setFonction("Chef BIBDA");
		
		ChefDepartement ali = new ChefDepartement(mediateurInfo);
		ali.setNom("Ali"); ali.setId(3); ali.setFonction("Chef YYYY");
		
		mediateurInfo.addChefDepartement(mohmad);
		mediateurInfo.addChefDepartement(omar);
		mediateurInfo.addChefDepartement(ali);
		
		Message m = new Message();
		m.destinaire = mohmad;
		m.contenu = "Bonjour Mr."+m.destinaire.getNom()+", le reste de message ....";
		omar.envoyerMessage(m);	
		
		m.destinaire = ali;
		m.contenu = "Bonjour Mr."+m.destinaire.getNom()+", le reste de message ....";
		omar.envoyerMessage(m);
	}

}
