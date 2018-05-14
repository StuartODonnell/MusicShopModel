import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setup(){
        trumpet = new Trumpet("Upul's Trumpet", 175.00, 200.00, InstrumentType.BRASS, "goldish", "brass", "Crumpet", "Renaissance", 34);
    }

    @Test
    public void hasDescription(){
        assertEquals("Upul's Trumpet", trumpet.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(175.00, trumpet.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(200.00, trumpet.getSellPrice(), 0.01);
    }


    @Test
    public void getInstrumentType(){
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
    }

    @Test
    public void canPlay(){
        assertEquals("parp....parpy...purp", trumpet.play());
    }

    @Test
    public void canGetNoOfValves(){
        assertEquals(34, trumpet.getNoOfValves());
    }
}
