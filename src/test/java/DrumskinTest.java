import items.Drumskin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumskinTest {

    Drumskin drumskin;

    @Before
    public void setup(){
        drumskin = new Drumskin("Roebuck Snare", 20.00, 30.00, "medium");

    }

    @Test
    public void hasDescription(){
        assertEquals("Roebuck Snare", drumskin.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(20.00, drumskin.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(30.00, drumskin.getSellPrice(), 0.01);
    }

    @Test
    public void hasSkinSize(){
        assertEquals("medium", drumskin.getSkinSize());
    }

    @Test
    public void setSkinSize(){
        drumskin.setSkinSize("Small");
        assertEquals("Small", drumskin.getSkinSize());
    }
}
