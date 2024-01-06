package Adapter;

public class Fete implements Evenement{
    int id ;
    String description;

    private IAdaptateur_Event_Batiment adapter;

    public void setAdapter(IAdaptateur_Event_Batiment adapter) {
        adapter = adapter;
    }

    public void setdescription(String str){
        this.description=str;
    };

    @Override
    public void Reserver() {
        if (this.adapter==null) System.out.println("Evenement sans Adaptateur");
        else{
            adapter.reserver(this.description,this.id);
        }

    }
}
