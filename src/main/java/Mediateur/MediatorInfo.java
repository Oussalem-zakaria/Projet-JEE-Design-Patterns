package Mediateur;

public class MediatorInfo extends Mediateur{

	@Override
	void transmettreMessage(Message message) {
		if (chefDepartements.isEmpty()) {
			System.out.println("Table de conaissance vide");
		} else {
			ChefDepartement chef = chefDepartements.get(message.destinaire.getId());
			if(chef == null) 
				System.out.println("chef n'existe pas ");
			else 
				chef.recevoireMessage(message);
		}
	}

	@Override
	void addChefDepartement(ChefDepartement ch) {
		super.chefDepartements.put(ch.getId(), ch);
	}

	public MediatorInfo() {
		super();
	}

}
