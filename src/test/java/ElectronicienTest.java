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
public class ElectronicienTest {
    
    @Test
    public void TestElectronicien() {
        Electronicien electronicien = new Electronicien(100, 50);
        assertNotNull(electronicien);
    }
    
 
}
