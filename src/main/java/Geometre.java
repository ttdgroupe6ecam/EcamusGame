public class Geometre extends Personnage {

  public Geometre(int pv, int force, int energie) {
    this.pv = pv;
    this.force = force;
    this.energie = energie;
    this.minDamage = -1;
    this.maxDamage = +2;
  }

  /**
   * Permet de setter la vie.
   * @param pv  PV
   */
  public void setPV(int pv) {
    this.pv = pv;
  }

  /**
   * Affiche Les infos du géomètre
   */
  public void draw() {
    System.out.println("Geometre: " + pv + ", " + force + "," + energie);
  }

}
