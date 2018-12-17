/**
 * this is th class to upgrade a personnage into an electronicien.
 * @author venon arthur
 */
class Electronicien extends Personnage {
  /**
   * constructor of the class.
   * @param pv the pv of the perso
   * @param force the force of the character
   */
  Electronicien(final int pv,final int force) {
    this.pv = pv;
    this.force = force;
    // this.minDamage = 0;
  }
}
