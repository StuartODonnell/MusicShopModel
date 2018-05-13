import items.Carrier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarrierTest {

    Carrier carrier;


    @Before
    public void setup(){
        carrier = new Carrier("Textile carrier", 50.00, 75.00, "Low");
        }

    @Test
    public void hasDescription(){
        assertEquals("Textile carrier", carrier.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(50.00, carrier.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(75.00, carrier.getSellPrice(), 0.01);
    }

    @Test
    public void hasStrength(){
        assertEquals("Low", carrier.getStrength());
    }

    @Test
    public void setStrength(){
        carrier.setStrength("Medium");
        assertEquals("Medium", carrier.getStrength());
    }

}
