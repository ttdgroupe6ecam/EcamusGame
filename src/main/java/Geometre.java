/** 
 * Represente un geometre.
 * @author adrien
 */
class Geometre extends Personnage {

  /**
   * Initialise geometre.
   * @param pvPar the pv of the character
   * @param forceParam it's force
   * @param energieParam it's energie
   */
  public Geometre(final int pvPar,final int forceParam,final int energieParam) {
    this.pv = pvPar;
    this.force = forceParam;
    this.energie = energieParam;
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
