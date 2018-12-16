/**
 * Automaticien class.
 * @author MediaMonster
 */
public class Automaticien extends Personnage {
 /**
     * @param pv **point de vie **
     * @param force ** la force  **
     * @param energie **l'énergie **
     */
  public Automaticien(final int pv, final int force, final int energie) {
    this.pv = pv;
    this.force = force;
    this.energie = energie;
    this.minDamage = +3;
    this.maxDamage = +1;
  }
}
