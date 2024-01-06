package Composite;

import methodeFactory.concret.batiment.classes.Classe;
import modele.Departement;

public class Main {
    public static void main(String[] args) {

        Departement dep=new Departement("Siences ",1);
        Emplacement bat=new Classe();
        Emplacement bat2=new Classe();
        bat.setId(15);
        bat2.setId(6);
        bat2.name="Salle TD";
        bat.name="Salle de cours";
        Departement depPhy=new Departement("depPhy",2);
        Emplacement depSVT=new Departement("depSVT",3);

        Departement depMathInfos=new Departement("depMathInfos",4);
        Departement info=new Departement("depinfo",41);
        Emplacement math=new Departement("depMath",42);
        
        dep.addEmplacements(depPhy);
        depPhy.addEmplacements(bat2);
        dep.addEmplacements(depSVT);
        dep.addEmplacements(depMathInfos);
        depMathInfos.addEmplacements(info);
        info.addEmplacements(bat);
        depMathInfos.addEmplacements(math);
        
        dep.getinfos();

    }
}
