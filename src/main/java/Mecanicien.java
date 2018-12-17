/**
 * upgrades a character into a mecanicien.
 * @author venon arthur
 */
public class Mecanicien extends Personnage {
  /**
   * constructor of the class.
   * @param pvPar it's pv
   * @param forcePar it's force
   * @param energiePa it's energie
   */
  public Mecanicien(final int pvPar, final int forcePar, final int energiePa) {
    this.pv = pvPar;
    this.force = forcePar;
    this.energie = energiePa;
    this.minDamage = +2;
    this.maxDamage = +2;
  }
}
