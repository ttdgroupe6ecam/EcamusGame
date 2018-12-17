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
    public  void CleMoletteDecorator(){
        Automaticien automaticien = new Automaticien(100, 50, 120);
        Decorator d;
        d = new CleMoletteDecorator(automaticien);
        assertNotNull(d);
    }
 
}
