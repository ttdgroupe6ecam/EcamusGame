/**
 * Represente un geometre.
 * @author adrien
 */
class Geometre extends Personnage {

  /**
   * Initialise geometre.
   * @param pvPar the pv of the character
   * @param forcePar it's force
   * @param energiePar it's energie
   */
  Geometre(final int pvPar, final int forcePar, final int energiePar) {
    this.pv = pvPar;
    this.force = forcePar;
    this.energie = energiePar;
    this.minDamage = -1;
    this.maxDamage = +2;
  }

  /**
   * Affiche Les infos du géomètre.
   */
  public final void draw() {
    System.out.println("Geometre: " + pv + ", " + force + "," + energie);
  }

}
