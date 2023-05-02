public class Cartridge extends Medium {

    private boolean vollständigesSet;
    private String entwicklerstudio;

    private Konsolentyp konsole;

    public Cartridge(String titel, double wert, String standort, boolean vollständigesSet, String entwicklerstudio, Konsolentyp konsole) {
        super(titel, wert, standort);
        this.vollständigesSet = vollständigesSet;
        this.entwicklerstudio = entwicklerstudio;
        this.konsole = konsole;
    }

    public boolean isVollständigesSet() {
        return vollständigesSet;
    }

    public void setVollständigesSet(boolean vollständigesSet) {
        this.vollständigesSet = vollständigesSet;
    }

    public String getEntwicklerstudio() {
        return entwicklerstudio;
    }

    public void setEntwicklerstudio(String entwicklerstudio) {
        this.entwicklerstudio = entwicklerstudio;
    }

    public Konsolentyp getKonsole() {
        return konsole;
    }

    public void setKonsole(Konsolentyp konsole) {
        this.konsole = konsole;
    }

    public void anzeigen() {
        super.anzeigen();
        System.out.println("[Cartridge] : vollständigesSet -> " + this.isVollständigesSet() + " Entwicklerstudio -> " + this.getEntwicklerstudio() + " Konsole -> " + this.getKonsole());

    }
}
