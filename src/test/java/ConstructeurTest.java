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
    
 
}
