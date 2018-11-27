import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class TestPerso {

    //public static Informaticien perso1 = new Informaticien(100, 50, 100);

    @Test
    public void subirTest() {
        Informaticien perso1 = new Informaticien(100, 50, 100);
        int oldpv = perso1.getPV();
        perso1.subir(15);
        assertEquals(perso1.getPV(),85);
    }

    @Test
    public void subir2Test() {
        Informaticien perso1 = new Informaticien(100, 50, 100);
        int oldpv = perso1.getPV();
        perso1.subir(30);
        assertEquals(perso1.getPV(),70);
    }

    @Test
    public void attaquerTest() {
        Informaticien perso1 = new Informaticien(100, 50, 100);
        int dmg = perso1.attaquer();
        assert dmg > 0;
    }

    @Test
    public void attaquerEnergyTest() {
        Informaticien perso1 = new Informaticien(100, 50, 100);
        int oldenergy = perso1.showEnergy();
        perso1.attaquer();
        assert perso1.showEnergy() < oldenergy;
    }
    @Test
    public void setPVTest() {
        Informaticien perso1 = new Informaticien(100, 50, 100);
        int oldpv = perso1.getPV();
        perso1.setPV(70);
        assert perso1.getPV() != oldpv;
    }

    @Test
    public void MortTest() {
        Informaticien perso1 = new Informaticien(100, 50, 100);
        perso1.subir(10000);
        assert perso1.getMort() == true;
    }

}