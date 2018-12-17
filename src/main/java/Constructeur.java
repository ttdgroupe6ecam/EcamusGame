/**
 * upgrades a charatcer into a contructeur
 * @author venon arthur
 */
class Constructeur extends Personnage {

  /**
   * Constructeur.
   * @param pvPar it's pv
   * @param forceParam it's force
   * @param energieParam it's energie
   */
   Constructeur(final int pvPar,final int forceParam,final int energieParam) {
    this.pv = pvPar;
    this.force = forceParam;
    this.energie = energieParam;
    this.minDamage = -3;
    this.maxDamage = +4;
  }

  /**
   * Affiche Les infos du constructeurs.
   */
  public void draw() {
    System.out.println("Constructeur: " + pv + ", " + force + "," + energie);
  }

}
