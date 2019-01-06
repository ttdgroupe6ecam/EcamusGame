import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonnageTest {

  @Test(timeout=5)
  public void setMortTest() {
    Informaticien perso1 = new Informaticien(100, 50);
    perso1.setMort();
    assertEquals(true, perso1.getMort());
  }

  @Test(timeout=5)
  public void attaquerTest() {
    Informaticien perso1 = new Informaticien(100, 50);
    int dmg = perso1.attaquer();
    assert dmg > 0;
  }

  @Test(timeout=5)
  public void attaquerEnergyTest() {
    Informaticien perso1 = new Informaticien(100, 50);
    int oldenergy = perso1.showEnergy();
    perso1.attaquer();
    assert perso1.showEnergy() < oldenergy;
  }

  @Test(timeout=5)
  public void subirTest() {
    Informaticien perso1 = new Informaticien(100, 50);
    perso1.subir(15);
    assertEquals(85, perso1.getPV());
  }

  @Test(timeout=5)
  public void showEnergyTest() {
    Informaticien perso1 = new Informaticien(100, 50);
    assert perso1.showEnergy() == 100;
  }

  @Test(timeout=5)
  public void setPVTest() {
    Informaticien perso1 = new Informaticien(100, 50);
    int oldpv = perso1.getPV();
    perso1.setPV(70);
    assert perso1.getPV() != oldpv;
  }

  @Test(timeout=5)
  public void getPVTest() {
    Informaticien perso1 = new Informaticien(100, 50);
    perso1.setPV(35);
    assert perso1.getPV() == 35;
  }

  @Test(timeout=5)
  public void subirMortTest() {
    Informaticien perso1 = new Informaticien(100, 50);
    perso1.subir(10000);
    assert perso1.getMort() == true;
  }

  @Test(timeout=5)
  public void parerTest() {
    Informaticien perso1 = new Informaticien(100, 50);
    perso1.parer();
    perso1.subir(100);
    assert perso1.getPV() == 70;
  }

  @Test(timeout=5)
  public void resetDefenseTest() {
    Informaticien perso1 = new Informaticien(100, 50);
    perso1.parer();
    perso1.resetDefense();
    assert perso1.defense == 0;
  }
}
