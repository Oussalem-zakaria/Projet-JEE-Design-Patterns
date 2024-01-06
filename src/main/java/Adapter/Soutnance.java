package Adapter;

public class Soutnance implements Evenement{
    int id ;
    String description;

    private IAdaptateur_Event_Batiment adapter;

    public void setAdapter(IAdaptateur_Event_Batiment adapter) {
        this.adapter = adapter;
    }

    public void setdescription(String str){
        this.description=str;
    };

    public Soutnance(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public void Reserver() {
        if (this.adapter==null) System.out.println("Evenement sans Adaptateur");
        else{
            adapter.reserver(this.description,this.id);
        }

    }

}
