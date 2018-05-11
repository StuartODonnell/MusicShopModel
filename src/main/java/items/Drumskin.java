package items;

import behaviours.ISell;

public class Drumskin extends Item implements ISell {

    String skinSize;

    public Drumskin(String description, double buyPrice, double sellPrice, String skinSize) {
        super(description, buyPrice, sellPrice);
        this.skinSize = skinSize;
    }

    public String getSkinSize() {
        return skinSize;
    }

    public void setSkinSize(String skinSize) {
        this.skinSize = skinSize;
    }
}
