package Adapter;

import methodeFactory.concret.batiment.classes.Administration;
import methodeFactory.concret.batiment.classes.Classe;
import modele.Batiment;

public class Main {

    public static void main(String[] args) {

        Evenement s=new Soutnance(10,"soutanance de fin d'année");
        IAdaptateur_Event_Batiment adapter=new Adaptateur();
        s.setAdapter(adapter);
        Batiment c= new Administration();
        c.setDescription("Adminstration");
        System.out.println(c.getDescription());
        adapter.setB(c);
        s.Reserver();
        System.out.println(c.getDescription());
    }


}
