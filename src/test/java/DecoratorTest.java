/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MediaMonster
 */
public class DecoratorTest {
    
    @Test
    public  void TestDecorateur(){
        Automaticien automaticien = new Automaticien(100, 50, 120);
        Decorator d;
        d = new SourisDecorator(automaticien);
        assertNotNull(d);
    }
    
     @Test
    public  void TestCleMoletteDecorator(){
        Automaticien automaticien = new Automaticien(100, 50, 120);
        Decorator d;
        d = new CleMoletteDecorator(automaticien);
        assertNotNull(d);
    }
    
       @Test
    public  void TestgetPersonnage(){
        Automaticien automaticien = new Automaticien(100, 50, 120);
        Decorator d;
        d = new CleMoletteDecorator(automaticien);
        assertNotNull(d.getPersonnage());
    }
    
       @Test
    public  void TestgetPV(){
        Automaticien automaticien = new Automaticien(100, 50, 120);
        Decorator d;
        d = new CleMoletteDecorator(automaticien);
        assertEquals(100,d.getPV());
    }
    
        @Test
    public  void TestsetPV(){
        Automaticien automaticien = new Automaticien(100, 50, 120);
        Decorator d;
        d = new CleMoletteDecorator(automaticien);
        d.setPV(10);
        assertEquals(10,d.getPV());
    }
    
       /*@Test
    public  void Testdraw(){
         Automaticien automaticien = new Automaticien(100, 50, 120);
        Decorator d;
        d = new CleMoletteDecorator(automaticien);
           assertNull(draw());
    }*/
    
    
    
 
}
