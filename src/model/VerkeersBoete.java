package model;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht 4.2 verkeersboete
 * <p>
 * Doel: dit programma berekent de hoogte van een verkeersboete afhankelijk van de overtreding
 */
public class VerkeersBoete {
    private String naamDader;
    private String kentekenAuto;
    private double bedrag;

    private VerkeersBoete(String naamDader, String kentekenAuto, double bedrag) {
        this.naamDader = naamDader;
        this.kentekenAuto = kentekenAuto;
        this.bedrag = bedrag;
    }

    public VerkeersBoete(String naamDader, String kentekenAuto) {
        this.naamDader = naamDader;
        this.kentekenAuto = kentekenAuto;
    }

    public VerkeersBoete(String naamDader) {
        this.naamDader = naamDader;
    }

    private int bepaalBedrag(){
        return 0;
    }

    public String toString(){
        return "Verkeersboete voor " + naamDader + ", kenteken " + kentekenAuto + ", " + bedrag + " euro";
    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    public double getBedrag() {
        return bedrag;
    }


}


