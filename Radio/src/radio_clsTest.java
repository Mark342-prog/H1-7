import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class radio_clsTest{

    radio_cls radio = new radio_cls();

    @Test
    public void testIsOn(){
       
        assertEquals(false, radio.isOn());
    }

    @Test 
    public void testGetStation(){
        
        radio.frequency = true;
        assertTrue(radio.getStation() == 530);

    }

    @Test
    public void testGetSavedStation(){

        radio.frequency = false;
        radio.saveStation(0, 87.9);
        assertTrue( radio.getSavedStation(0) == 0);
    }

    @Test 
    public void testGetFrequency(){
        
        assertEquals(false, radio.getFrequency());
    }

    @Test
    public void testSwitchAMFM(){

        radio.switchAMFM();
        assertEquals(true, radio.getFrequency());
    }

}