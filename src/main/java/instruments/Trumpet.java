package instruments;

public class Trumpet extends Instrument{

    public int noOfValves;

    public Trumpet(String description, double buyPrice, double sellPrice, InstrumentType instrumentType, String colour, String material, String make, String model, int noOfValves) {
        super(description, buyPrice, sellPrice, instrumentType.BRASS, colour, material, make, model);
        this.noOfValves = noOfValves;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    public void setNoOfValves(int noOfValves) {
        this.noOfValves = noOfValves;
    }

    public String play(){
        return "parp....parpy...purp";

    }
}
