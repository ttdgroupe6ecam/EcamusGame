/**
 * upgrades a character into an automaticien.
 * @author venon arthur
 */
public class Automaticien extends Personnage {
  /**
   * constructor of the class.
   * @param pvPar it's pv
   * @param forceParam it's force
   * @param energieParam it's energie
   */
  Automaticien(final int pvPar, final int forceParam, final int energieParam) {
    this.pv = pvPar;
    this.force = forceParam;
    this.energie = energieParam;
    this.minDamage = +3;
    this.maxDamage = +1;
  }
}
