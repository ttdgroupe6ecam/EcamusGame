/**
 * this is th class to upgrade a personnage into an electronicien.
 * @author venon arthur
 */
class Electronicien extends Personnage {
  /**
   * constructor of the class.
   * @param pvParam the pv of the perso
   * @param forceParam the force of the character
   */
  Electronicien(final int pvParam, final int forceParam) {
    this.pv = pvParam;
    this.force = forceParam;
    // this.minDamage = 0;
  }
}
