/**
 * Represente un informaticien.
 * @author adrien
 */
public class Informaticien extends Personnage {


  /**
   * Initialise l'informaticien.
   * @param pvParam it's pv
   * @param forceParam it's force
   */
  public Informaticien(final int pvParam,final int forceParam) {
    this.pv = pvParam;
    this.force = forceParam;
    this.maxDamage = 50;
  }

  /**
   * Affiche Les infos de l'informaticien.
   */
  public final void draw() {
    System.out.println(
        "Informaticien: " + "Point de vie :" 
                + pv + " Force : " + force + " Energie :" + energie);
  }

}
