package modele;

import java.util.Map;

import abstractFactory2.AbstractUser;


public class Enseignant extends Personnel implements AbstractUser {
	
	@Override
	public void introduce() {
		System.out.println("I am a teacher.");
	}


}
