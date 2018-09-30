package be.vives.ti;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoudenLidTest {

    GoudenLid glLid;
    @Before
    public void setUp()  {
        glLid = new GoudenLid("Umaru","0489183199",10);
    }

    @Test
    public void TestGetAantalAandelen() {
        assertEquals(10,glLid.getAantalAandelen());
    }

    @Test
    public void TestSetAantalAandelenPositief() {
        int n=30;
        glLid.setAantalAandelen(n);
        assertEquals("Umaru", glLid.getNaam());
        assertEquals("0489183199",glLid.getTel());
        assertEquals(30,glLid.getAantalAandelen());

    }

    @Test
    public void TestSetAantalAandelNegatief(){
        int k = -20;
        glLid.setAantalAandelen(k);
        assertEquals("Umaru", glLid.getNaam());
        assertEquals(0,glLid.getAantalAandelen());


    }

    @Test
    public void TestGeefKorting() {
        assertEquals(0.05,glLid.geefKorting(), 0.0);

    }



}