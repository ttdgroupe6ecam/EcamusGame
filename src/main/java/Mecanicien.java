public class Mecanicien extends Personnage {

  public Mecanicien(int pv, int force, int energie) {
    this.pv = pv;
    this.force = force;
    this.energie = energie;
    this.minDamage = +2;
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
   * Affiche Les infos du mécanicien
   */
  public void draw() {
    System.out.println("Mecancien: " + pv + ", " + force + "," + energie);
  }

  /**
   * Permet de réduire les dégats subis
   */
  public void parer() {
    force = -1;
  }
}
