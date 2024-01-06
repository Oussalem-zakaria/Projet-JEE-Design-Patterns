package modele;

import java.util.ArrayList;


import Composite.Emplacement;


public class Departement extends Emplacement {
	int id;
	private Personnel chefDepartment;
	public ArrayList<Emplacement> l;

	public Departement(String name, int id) {
		this.name = name;
		this.id = id;
		this.l = new ArrayList<Emplacement>();
	}

	public void setChefDepartment(Personnel chefDepartment) {
		this.chefDepartment = chefDepartment;
	}

	@Override
	public void getinfos() {
		String str = "";
		for (int i = 0; i < this.getNiveau(); i++) {
			str += "---";
		}
		String result = (str == "") ? (str + "Emplacement " + name + " numero " + id)
				: (str + "Departement " + name + " numero " + id);

		System.out.println(result);

		if (!l.isEmpty()) {
			l.forEach((e) -> e.getinfos());
		}
	}

	public void addEmplacements(Emplacement e) {
		e.setNiveau(this.getNiveau() + 1);
		l.add(e);
	}

	public void removeEmplacements(Emplacement e) {
		l.remove(e.getId());
	}
}
