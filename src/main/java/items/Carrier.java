package items;

import behaviours.ISell;

public class Carrier extends Item implements ISell {

    String strength;

    public Carrier(String description, double buyPrice, double sellPrice, String strength) {
        super(description, buyPrice, sellPrice);
        this.strength = strength;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }


}
