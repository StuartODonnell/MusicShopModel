package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import items.Item;

public abstract class Instrument extends Item implements ISell, IPlay {

    protected String colour;
    protected String material;
    protected InstrumentType instrumentType;
    protected String make;
    protected String model;
    protected int numberOfStrings;

    public Instrument(String description, double buyPrice, double sellPrice, String colour, String material, InstrumentType instrumentType, String make, String model, int numberOfStrings) {
        super(description, buyPrice, sellPrice);
        this.colour = colour;
        this.material = material;
        this.instrumentType = instrumentType;
        this.make = make;
        this.model = model;
        this.numberOfStrings = numberOfStrings;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }


}
