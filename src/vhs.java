public class vhs extends Medium {

    private int spieldauer;

    private String qualität;

    public vhs(String titel, double wert, String standort, int spieldauer, String qualität) {
        super(titel, wert, standort);
        this.spieldauer = spieldauer;
        this.qualität = qualität;
    }

    public int getSpieldauer() {
        return spieldauer;
    }

    public void setSpieldauer(int spieldauer) {
        this.spieldauer = spieldauer;
    }

    public String getQualität() {
        return qualität;
    }

    public void setQualität(String qualität) {
        this.qualität = qualität;
    }
    public void anzeigen(){
        super.anzeigen();
        System.out.println("[VHS] : Spieldauer -> " + this.getSpieldauer() + " Qualität -> " + this.getQualität());
    }
}
