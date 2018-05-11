package items;

import behaviours.ISell;

public class Amplifier extends Item implements ISell {


    int outputPower;

    public Amplifier(String description, double buyPrice, double sellPrice, int outputPower) {
        super(description, buyPrice, sellPrice);
        this.outputPower = outputPower;
    }

    public int getOutputPower() {
        return outputPower;
    }

    public void setOutputPower(int outputPower) {
        this.outputPower = outputPower;
    }
}

