package items;

import behaviours.ISell;

public abstract class Item implements ISell {

    protected String description;
    protected double buyPrice;
    protected double sellPrice;

    public Item(String description, double buyPrice, double sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup(){

        return (sellPrice - buyPrice);
    }
}
