package model;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht
 * <p>
 * Doel:
 */
public class SnelheidsBoete extends VerkeersBoete {

    private int gemetenSnelheid;
    private int maximumSnelheid;
    final int GRENS_VERKEERSBOETE_LAAG = 10;
    final int GRENS_VERKEERSBOETE_HOOG = 30;
    final int BOETE_PER_KM_LAAG = 10;
    final int BOETE_PER_KM_MIDDEL = 15;
    final int BOETE_PER_KM_HOOG = 20;
    final int MAXIMUM_BOETE = 1000;



    public SnelheidsBoete(String naamDader, String kentekenAuto, int gemetenSnelheid, int maximumSnelheid) {
        super(naamDader, kentekenAuto);
        this.gemetenSnelheid = gemetenSnelheid;
        this.maximumSnelheid = maximumSnelheid;
        bepaalBdedrag();
    }

    public void bepaalBdedrag(){
        int snelheidsVerschil = this.gemetenSnelheid - this.maximumSnelheid;
        double bedrag;
        if (snelheidsVerschil < GRENS_VERKEERSBOETE_LAAG){
            bedrag = snelheidsVerschil * BOETE_PER_KM_LAAG;
        } else if (snelheidsVerschil <= GRENS_VERKEERSBOETE_HOOG){
            bedrag = snelheidsVerschil * BOETE_PER_KM_MIDDEL;
        } else {
            bedrag = snelheidsVerschil * BOETE_PER_KM_HOOG;
        }
        if(bedrag > MAXIMUM_BOETE){
            bedrag = MAXIMUM_BOETE;
        }
        super.setBedrag(bedrag);
    }

    public String toString(){
        return super.toString().replace("Verkeersboete", "Snelheidsboete") + " voor " + gemetenSnelheid
                + " km/u waar " + maximumSnelheid + " is toegestaan.";
    }
}
