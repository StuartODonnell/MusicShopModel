import instruments.Banjolele;
import instruments.InstrumentType;
import instruments.Timpani;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop1;
    Banjolele banjolele1;
    Timpani timpani1;

    @Before
    public void setup(){
        shop1 = new Shop();
        banjolele1 = new Banjolele("Tanzanian Tenor", 100.00, 150.00, InstrumentType.STRING, "tan", "walnut", "Yamahaha", "BX1", 4);
        timpani1 = new Timpani("Kettle of kettles", 1000.00, 1500.00, InstrumentType.PERCUSSION, "copper", "copper", "BigBoss", "DD10", 2);
    }
    @Test
    public void inventoryStartsEmpty(){
        assertEquals(0, shop1.getInventoryCount());
    }

    @Test
    public void canAddItemToInventory(){
        shop1.addItemToInventory(banjolele1);
        assertEquals(1,shop1.getInventoryCount());
    }

    @Test
    public void removeItemFromInventory(){
        shop1.addItemToInventory(banjolele1);
        shop1.addItemToInventory(banjolele1);
        shop1.removeItemFromInventory(banjolele1);
        assertEquals(1, shop1.getInventoryCount());

    }

    @Test
    public void getPotentialProfit(){
        shop1.addItemToInventory(banjolele1);
        shop1.addItemToInventory(banjolele1);
        shop1.addItemToInventory(timpani1);
        shop1.addItemToInventory(timpani1);
        assertEquals(1100, shop1.getPotentialProfit());

    }


}






//
//    @Test
//    public void canGetTotalPossibleProfit() {
//        shop1.addISellItem(guitar1);
//        assertEquals(100, shop1.getTotalPossibleProfit());
//    }