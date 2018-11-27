/** Represente un geometre
 * @author adrien
 */
public class Geometre extends Personnage {

  /**
   * Initialise geometre
   * @param pv
   * @param force
   * @param energie
   */
  public Geometre(int pv, int force, int energie) {
    this.pv = pv;
    this.force = force;
    this.energie = energie;
    this.minDamage = -1;
    this.maxDamage = +2;
  }

  /**
   * Affiche Les infos du géomètre
   */
  public void draw() {
    System.out.println("Geometre: " + pv + ", " + force + "," + energie);
  }

}
