package be.vives.ti;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LidTest {


    Lid lid;

    @Before
    public void setUp()  {
        lid = new Lid("Barrie", "0493971444");

    }

    @Test
    public void TestGetTel() {
        assertEquals("0493971444",lid.getTel());
    }

    @Test
    public void TestSetTel() {
        lid.setTel("0489183199");
        assertEquals("Barrie", lid.getNaam());
        assertEquals("0489183199",lid.getTel());
    }

    @Test
    public void TestGetNaam() {

        assertEquals("Barrie", lid.getNaam());
    }



    @Test
    public void TestGeefKorting(){
        assertEquals(0.0,lid.geefKorting(),0.0);

    }

}