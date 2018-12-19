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
public class AutomaticienTest {
    
    @Test
    public  void Testautomaticien(){
        Automaticien automaticien = new Automaticien(100, 50, 120);
        assertNotNull(automaticien);
    }
    
    
      @Test
    public  void TestSetPV(){
        Automaticien automaticien = new Automaticien(100, 50, 120);
         automaticien.setPV(12);
        assertEquals(12,automaticien.getPV());
    }
    
       @Test
    public  void TestGetPV(){
        Automaticien automaticien = new Automaticien(100, 50, 120);
         int pv = automaticien.getPV();
        assertEquals(pv,automaticien.getPV());
    }
    
    
 
}
