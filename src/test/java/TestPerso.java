package test.java;

import main.java.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPerso {

    private static Personnage perso1;
    private static Personnage perso2;

    @Test
    private void attaquerTest() {
        assertEquals(perso1.attaquer(),10);
    }

}
