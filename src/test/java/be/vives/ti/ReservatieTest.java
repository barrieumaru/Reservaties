package be.vives.ti;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReservatieTest {

    Boot b;

    @Before
    public void setUp()  {

    }
    //motorboot zonder radar en fishfinder
    @Test
    public void testTeBetalenMotorBoot(){
        Motorboot b = new Motorboot("m1",false,false);
        Lid l = new Lid("l1","0493971444");
        Reservatie r = new Reservatie(l,b,3);
        assertEquals(75,r.teBetalen(),0.0);
    }
    // zeilboot met goudlid
    @Test
    public void testTeBetalenZeilBoot(){
        Zeilboot z = new Zeilboot("z1",false,false);
        Lid l = new Lid("l2","0483181235");
        Reservatie r = new Reservatie(l,z,2);
        assertEquals(100,r.teBetalen(),0.0);

    }

    //motorboot met radar en fishfinder
    @Test
    public void testTeBetalenMotorBootRadarFishFinder(){
        Motorboot b = new Motorboot("m1",true,true);
        Lid l = new Lid("l1","0493971444");
        Reservatie r = new Reservatie(l,b,2);
        assertEquals(56,r.teBetalen(),0.0);

    }
    // zeilboot met radar en gps
    @Test
    public void testTeBetalenZeilBootRadarGPS(){
        Zeilboot z = new Zeilboot("z1",true,true);
        Lid l = new Lid("l2","0483181235");
        Reservatie r = new Reservatie(l,z,2);
        assertEquals(108,r.teBetalen(),0.0);

    }
    //testNegatiefUur
    @Test
    public void testSetUrenNegatief(){

        Zeilboot z = new Zeilboot("z1",false,false);
        Lid l = new Lid("l2","0483181235");
        Reservatie r = new Reservatie(l,z,-2);
        assertEquals(l,r.getLid());
        assertEquals(z,r.getBoot());
        assertEquals(0.0,r.getAantalUren(),0.0);
    }
    //positief uur testen
    @Test
    public void testSetUrenPositieftief(){
        Zeilboot z = new Zeilboot("z1",false,false);
        Lid l = new Lid("l2","0483181235");
        Reservatie r = new Reservatie(l,z,2);
        assertEquals(l,r.getLid());
        assertEquals(z,r.getBoot());
        assertEquals(2.0,r.getAantalUren(),0.0);
    }

}