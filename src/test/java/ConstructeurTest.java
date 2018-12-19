/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author MediaMonster
 */
public class ConstructeurTest {
    
    @Test
    public void TestConstructeur() {
        Constructeur constructeur = new Constructeur(10, 20, 1000);
        assertNotNull(constructeur);
    }
    
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
    
    public void out() {
        System.out.print("hello");
        assertEquals("hello", outContent.toString());
    }
 
}
