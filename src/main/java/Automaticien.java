public class Automaticien extends Personnage {

  public Automaticien(int pv, int force, int energie) {
    this.pv = pv;
    this.force = force;
    this.energie = energie;
    this.minDamage = +3;
    this.maxDamage = +1;
  }

  /**
   * Permet de setter la vie.
   * @param pv  PV
   */

  public void setPV(int pv) {
    this.pv = pv;
  }

  /**
   * Affiche Les infos de l'automaticien
   */
  public void draw() {
    System.out.println("Automaticien: " + pv + ", " + force + "," + energie);
  }

}
