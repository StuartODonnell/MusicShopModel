package shop;

import items.Item;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> inventory;


    public Shop() {

        this.inventory = new ArrayList<>();

    }


    public ArrayList<Item> getInventory() {
        return inventory;
    }



    public int getInventoryCount(){
        return this.inventory.size();
    }

    public void addItemToInventory(Item item){
        this.inventory.add(item);

    }

    public void removeItemFromInventory(Item inventory) {
        this.inventory.remove(inventory);
    }

    public int getPotentialProfit(){
        int total = 0;
        for (Item inventory : inventory){
            total += inventory.calculateMarkup();
        }

        return total;

    }
}
