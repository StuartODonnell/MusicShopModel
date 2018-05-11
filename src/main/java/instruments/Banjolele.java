package instruments;

public class Banjolele extends Instrument{

public int noOfStrings;

    public Banjolele(String description, double buyPrice, double sellPrice, String colour, String material, InstrumentType instrumentType, String make, String model, int numberOfStrings, int noOfStrings) {
        super(description, buyPrice, sellPrice, colour, material, instrumentType, make, model, numberOfStrings);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public void setNoOfStrings(int noOfStrings) {
        this.noOfStrings = noOfStrings;
    }

    public String play(){
        return "twink....twinky...twang";

    }

}
