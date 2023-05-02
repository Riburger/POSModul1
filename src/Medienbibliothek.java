import java.util.ArrayList;

public class Medienbibliothek {

    private ArrayList<Medium> medienliste;

    public Medienbibliothek(){
        this.medienliste = new ArrayList<>();
    }
    public void mediumHinzufügen(Medium m){
        this.medienliste.add(m);
    }

    public void alleMedienAusgeben()
    {
        for (Medium m : medienliste)
        {
            System.out.println("-----------------------------------");
            m.anzeigen(); //polymorpher Methodenaufruf
        }
    }

    public ArrayList<VHS> alleVHSalsListe()
    {
      ArrayList<VHS> vhs = new ArrayList<>();
      for (Medium aktuellesMedium : medienliste){
          if (aktuellesMedium instanceof VHS){
              vhs.add((VHS)aktuellesMedium);
          }



       }
        return vhs;}
}
