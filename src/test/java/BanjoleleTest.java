import instruments.Banjolele;
import instruments.InstrumentType;
import items.Amplifier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BanjoleleTest {


    Banjolele banjolele;

    @Before
    public void setup(){
        banjolele = new Banjolele("Tanzanian Tenor", 100.00, 150.00, InstrumentType.STRING, "tan", "walnut", "Yamahaha", "BX1", 4);
    }

    @Test
    public void getInstrumentType(){
        assertEquals(InstrumentType.STRING, banjolele.getInstrumentType());
    }

    @Test
    public void canPlay(){
        assertEquals("twink....twinky...twang", banjolele.play());
    }

    @Test
    public void canGetNoOfStrings(){
        assertEquals(4, banjolele.getNoOfStrings());
    }


}
