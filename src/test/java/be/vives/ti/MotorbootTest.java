package be.vives.ti;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MotorbootTest {
    Boot b;

    @Before
    public void setUp(){
        b = new Motorboot("boot1",true,false);
    }



    //fishfinder controleren
    @Test
    public void TestIsFishFinderAanBoord() {
        assertEquals("boot1",b.getNaam());
        assertEquals(true,b.isRadarAanBoord());
        assertEquals(false,b.isFishFinderAanBoord());
    }

    //fish finder op true zetten
    @Test
    public void setFishFinderOpPos(){
        Motorboot m = new Motorboot("boot1",true,true);
        assertEquals("boot1",m.getNaam());
        assertEquals(true,m.isRadarAanBoord());
        assertEquals(true,m.isFishFinderAanBoord());
    }
    @Test
    //Radar en fishfinder aanboord
    public void testRadarFishFinder(){
        Motorboot m = new Motorboot("boot1",true,true);
        assertEquals("boot1",m.getNaam());
        assertEquals(true,m.isRadarAanBoord());
        assertEquals(true,m.isFishFinderAanBoord());
        assertEquals(28,m.prijsPerUur(),0.0);
    }

    @Test
    //Radar op true en fishfinder op false
    public void testRadarAanBoordFishfinderNot(){
        Motorboot m = new Motorboot("boot1",true,false);
        assertEquals("boot1",m.getNaam());
        assertEquals(false,m.isFishFinderAanBoord());
        assertEquals(true,m.isRadarAanBoord());
        assertEquals(26.25,m.prijsPerUur(),0.0);
    }

    @Test
    //Radar op false en fishfinder op true
    public void testFishFinderAanBoordRadarNot(){
        Motorboot m = new Motorboot("boot1",false,true);
        assertEquals("boot1",m.getNaam());
        assertEquals(true,m.isFishFinderAanBoord());
        assertEquals(false,m.isRadarAanBoord());
        assertEquals(26.75,m.prijsPerUur(),0.0);
    }

    @Test
    public void setPrijsPerUur(){
        assertEquals(26.25,b.prijsPerUur(),0.0);
    }

}