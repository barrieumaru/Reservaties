package be.vives.ti;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZeilbootTest {

    Zeilboot zeilboot;


    @Before
    public void setUp()  {
        zeilboot = new Zeilboot("boot1",true,false);
    }

    @Test
    public void TestIsGPSAanBoord() {

        assertEquals(false,zeilboot.isGPSAanBoord());
    }
    //prijsperuur radar is true en gps is false

    @Test
    public void testPrijsPerUur(){
        assertEquals("boot1",zeilboot.getNaam());
        assertEquals(true,zeilboot.isRadarAanBoord());
        assertEquals(false,zeilboot.isGPSAanBoord());
        assertEquals(52.5,zeilboot.prijsPerUur(),0.0);
    }

    //gps aanboord radar op false
    @Test
    public void testPrijsPerUurGPSAanboordRadarNot(){
        zeilboot = new Zeilboot("boot1",false,true);
        assertEquals("boot1",zeilboot.getNaam());
        assertEquals(false,zeilboot.isRadarAanBoord());
        assertEquals(true,zeilboot.isGPSAanBoord());
        assertEquals(51.5,zeilboot.prijsPerUur(),0.0);
    }
    // gps en radar aanboord
    @Test
    public void testPrijsPerUurRadarGPS(){
        zeilboot = new Zeilboot("boot1",true,true);
        assertEquals("boot1",zeilboot.getNaam());
        assertEquals(true,zeilboot.isRadarAanBoord());
        assertEquals(true,zeilboot.isGPSAanBoord());
        assertEquals(54,zeilboot.prijsPerUur(),0.0);
    }

    //Bootnaam aanpassen
    @Test
    public void TestSetBootNaam(){
        Boot b = new Zeilboot("boot1",false,true);
        b.setNaam("boot12");
        assertEquals(true,zeilboot.isRadarAanBoord());
        assertEquals(false,zeilboot.isGPSAanBoord());
        assertEquals("boot12",b.getNaam());


    }

    @Test
    public void TestIsRadarAAnBoord(){

        assertEquals(true,zeilboot.isRadarAanBoord());
    }

}