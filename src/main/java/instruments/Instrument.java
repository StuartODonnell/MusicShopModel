package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import items.Item;

public abstract class Instrument extends Item implements IPlay {

    protected InstrumentType instrumentType;
    protected String colour;
    protected String material;
    protected String make;
    protected String model;
    protected int numberOfStrings;

    public Instrument(String description, double buyPrice, double sellPrice, InstrumentType instrumentType, String colour, String material, String make, String model) {
        super(description, buyPrice, sellPrice);
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.material = material;
        this.make = make;
        this.model = model;

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



//    sell

}
