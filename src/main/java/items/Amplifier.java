package items;

import behaviours.ISell;

public class Amplifier extends Item implements ISell {


    int volume;

    public Amplifier(String description, double buyPrice, double sellPrice, int volume) {
        super(description, buyPrice, sellPrice);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;

    }


}

