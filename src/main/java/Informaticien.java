public class Informaticien extends Personnage {

  public Informaticien(int pv, int force, int energie) {
    this.pv = pv;
    this.force = force;
    this.energie = energie;
    this.maxDamage = 50;
  }

  /**
   * Permet de setter la vie.
   * @param pv  PV
   */
  public void setPV(int pv) {
    this.pv = pv;
  }

  /**
   * Affiche Les infos de l'informaticien
   */
  public void draw() {
    System.out.println(
        "Informaticien: " + "Point de vie :" + pv + " Force : " + force + " Energie :" + energie);
  }

  /**
   * Permet de réduire les dégats subis
   */
  public void parer() {
    force = -1;
  }
}
