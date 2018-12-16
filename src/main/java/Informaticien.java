/**
 * Represente un informaticien
 * @author adrien
 */
public class Informaticien extends Personnage {


  /**
   * Initialise l'informaticien
   * @param pv **pv**
   * @param force **force**
   */
  public Informaticien(final int pv, final int force) {
    this.pv = pv;
    this.force = force;
    this.maxDamage = 50;
  }

  /**
   * Affiche Les infos de l'informaticien
   */
  public final void draw() {
    System.out.println(
        "Informaticien: " + "Point de vie :" 
                + pv + " Force : " + force + " Energie :" + energie);
  }

}
