package instruments;

public class Timpani extends Instrument {

    public int noOfDrums;

    public Timpani(String description, double buyPrice, double sellPrice, InstrumentType instrumentType, String colour, String material, String make, String model, int noOfDrums) {
        super(description, buyPrice, sellPrice, instrumentType.PERCUSSION, colour, material, make, model);
        this.noOfDrums = noOfDrums;
    }

    public int getNoOfDrums() {
        return noOfDrums;
    }

    public void setNoOfDrums(int noOfDrums) {
        this.noOfDrums = noOfDrums;
    }

    public String play(){
        return "boom....boomy...bam";

    }
}