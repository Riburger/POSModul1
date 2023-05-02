public class app{

    public static void main(String[] args) {

        Medienbibliothek bib = new Medienbibliothek();

        VHS heman = new VHS("He-Man and the Masters of Universe",120.99,"Büro UG", 120, "Ausgezeichnet" );
        Cartridge zelda = new Cartridge(" Zelda - Ocarina of Time", 999, "Tresor", true, "Nintendo", Konsolentyp.N64);
        Buch herr = new Buch("Herr der Ringe", 49.99, "Wohnzimmer OG", "1312");


        bib.mediumHinzufügen(heman);
        bib.mediumHinzufügen(zelda);
        bib.mediumHinzufügen(herr);

        bib.alleMedienAusgeben();
        System.out.println("");
        System.out.println("Alle VHS in der Liste");
        for (VHS vhs : bib.alleVHSalsListe())
        {
            vhs.anzeigen();
        }
    }
}
