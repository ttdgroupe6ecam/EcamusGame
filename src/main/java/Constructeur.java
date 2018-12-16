/**
 * Constructeur class.
 * @author MediaMonster
 */
class Constructeur extends Personnage {

    /**
     * Constructeur.
     * @param pv **point de vie **
     * @param force ** la force  **
     * @param energie **l'énergie **
     */
   public Constructeur(final int pv, final int force, final int energie) {
    this.pv = pv;
    this.force = force;
    this.energie = energie;
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
