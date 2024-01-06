package Adapter;

import modele.Batiment;

public interface IAdaptateur_Event_Batiment {
    void reserver(String desc,int id);
    void setB(Batiment b);

}
