package controller;

import model.ParkeerBoete;
import model.SnelheidsBoete;
import model.VerkeersBoete;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht
 * <p>
 * Doel:
 */
public class VerkeersBoeteLauncher {

    public static void main(String[] args) {
        VerkeersBoete eersteBoete = new VerkeersBoete("Jan Smit", "04-SPZ-8");
        eersteBoete.setBedrag(100);
        System.out.println(eersteBoete);

        VerkeersBoete tweedeBoete = new ParkeerBoete("Jan Smit", "04-SPZ-8", 2);
        System.out.println(tweedeBoete);

        VerkeersBoete derdeBoete = new SnelheidsBoete("Jan Smit", "04-SPZ-8",
                102, 80);
        System.out.println(derdeBoete);
    }
}
