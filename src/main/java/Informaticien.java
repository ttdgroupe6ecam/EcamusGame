/** Represente un informaticien
 * @author adrien
 */
public class Informaticien extends Personnage {


  /**
   * Initialise l'informaticien
   * @param pv
   * @param force
   */
  public Informaticien(int pv, int force) {
    this.pv = pv;
    this.force = force;
    this.maxDamage = 50;
  }

  /**
   * Affiche Les infos de l'informaticien
   */
  public void draw() {
    System.out.println(
        "Informaticien: " + "Point de vie :" + pv + " Force : " + force + " Energie :" + energie);
  }

}
