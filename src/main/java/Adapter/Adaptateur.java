package Adapter;

import modele.Batiment;

public class Adaptateur implements IAdaptateur_Event_Batiment{
    private Batiment b;

	@Override
    public void setB(Batiment b) {
        this.b = b;
    }

    @Override
    public void reserver(String desc,int id) {
    b.organiser(desc,id);

    }
}
