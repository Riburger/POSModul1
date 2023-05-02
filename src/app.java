public class app{

    public static void main(String[] args) {

        Medienbibliothek bib = new Medienbibliothek();

        VHS heman = new VHS("He-Man and the Masters of Universe",120.99,"Büro UG", 120, "Ausgezeichnet" );
        Cartridge zelda = new Cartridge(" Zelda - Ocarina of Time", 999, "Tresor", true, "Nintendo", Konsolentyp.N64);

        bib.mediumHinzufügen(heman);
        bib.mediumHinzufügen(zelda);

        bib.alleMedienAusgeben();

    }
}
