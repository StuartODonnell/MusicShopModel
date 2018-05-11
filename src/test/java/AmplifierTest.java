import items.Amplifier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmplifierTest {

Amplifier amplifier;

    @Before
        public void setup(){
            amplifier = new Amplifier("amp", 100.00, 150.00, 11);
    }

    @Test
    public void hasDescription(){
        assertEquals("amp", amplifier.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(100.00, amplifier.getBuyPrice(), 0.01);
    }

}
