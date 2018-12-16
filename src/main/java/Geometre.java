/** Represente un geometre
 * @author adrien
 */
public class Geometre extends Personnage {

  /**
   * Initialise geometre ** geometre **
   * @param pv **point de vie **
   * @param force ** la force  **
   * @param energie **l'énergie **
   */
  public Geometre(final int pv,final int force,final int energie) {
    this.pv = pv;
    this.force = force;
    this.energie = energie;
    this.minDamage = -1;
    this.maxDamage = +2;
  }

  /**
   * Affiche Les infos du géomètre
   */
  public final void draw() {
    System.out.println("Geometre: " + pv + ", " + force + "," + energie);
  }

}
