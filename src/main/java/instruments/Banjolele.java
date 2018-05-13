package instruments;

public class Banjolele extends Instrument{

public int noOfStrings;

    public Banjolele(String description, double buyPrice, double sellPrice, InstrumentType instrumentType, String colour, String material, String make, String model, int noOfStrings) {
        super(description, buyPrice, sellPrice, instrumentType.STRING, colour, material, make, model);
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
