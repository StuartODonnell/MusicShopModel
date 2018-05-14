import instruments.Banjolele;
import instruments.Instrument;
import instruments.InstrumentType;
import instruments.Timpani;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimpaniTest {


    Timpani timpani;

    @Before
    public void setup(){
        timpani = new Timpani("Kettle of kettles", 1000.00, 1500.00, InstrumentType.PERCUSSION, "copper", "copper", "BigBoss", "DD10", 2);
    }

    @Test
    public void hasDescription(){
        assertEquals("Kettle of kettles", timpani.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(1000.00, timpani.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(1500.00, timpani.getSellPrice(), 0.01);
    }


    @Test
    public void getInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, timpani.getInstrumentType());
    }

    @Test
    public void canPlay(){
        assertEquals("boom....boomy...bam", timpani.play());
    }

    @Test
    public void canGetNoOfDrums(){
        assertEquals(2, timpani.getNoOfDrums());
    }
}
