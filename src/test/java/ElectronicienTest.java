import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class ElectronicienTest {

  @Test
  public void subirTest() {
    Electronicien perso1 = new Electronicien(100, 50, 100);
    int oldpv = perso1.getPV();
    perso1.subir(15);

    assertEquals(perso1.getPV(), 85);
  }

  @Test
  public void subir2Test() {
    Electronicien perso1 = new Electronicien(100, 50, 100);
    int oldpv = perso1.getPV();
    perso1.subir(30);
    assertEquals(perso1.getPV(), 70);
  }

  @Test
  public void attaquerTest() {
    Electronicien perso1 = new Electronicien(100, 50, 100);
    int dmg = perso1.attaquer();
    assert dmg > 0;
  }

  @Test
  public void attaquerEnergyTest() {
    Electronicien perso1 = new Electronicien(100, 50, 100);
    int oldenergy = perso1.showEnergy();
    perso1.attaquer();
    assert perso1.showEnergy() < oldenergy;
  }

  @Test
  public void setPVTest() {
    Electronicien perso1 = new Electronicien(100, 50, 100);
    int oldpv = perso1.getPV();
    perso1.setPV(70);
    assert perso1.getPV() != oldpv;
  }

  @Test
  public void MortTest() {
    Electronicien perso1 = new Electronicien(100, 50, 100);
    perso1.subir(10000);
    assert perso1.getMort() == true;
  }
}
