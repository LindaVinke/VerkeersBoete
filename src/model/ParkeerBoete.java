package model;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht
 * <p>
 * Doel:
 */
public class ParkeerBoete extends VerkeersBoete {
    private int zone;
    final static int BOETE_ZONE_1 = 60;
    final static int BOETE_ZONE_2 = 100;
    final static int BOETE_ZONE_3 = 180;


    public ParkeerBoete(String naamDader, String kentekenAuto, int zone) {
        super(naamDader, kentekenAuto);
        this.zone = zone;
        bepaalBedrag();
    }

    public void bepaalBedrag() {
        switch (this.zone) {
            case 1 :
                super.setBedrag(BOETE_ZONE_1);
                break;
            case 2 :
                setBedrag(BOETE_ZONE_2);
                break;
            case 3 :
                setBedrag(BOETE_ZONE_3);
                break;
        }
    }

    @Override
    public String toString() {
        return  super.toString() + " in zone 2.";
    }
}
