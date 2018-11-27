public class Mecanicien extends Personnage {

  public Mecanicien(int pv, int force, int energie) {
    this.pv = pv;
    this.force = force;
    this.energie = energie;
    this.minDamage = +2;
    this.maxDamage = +2;
  }

  /**
   * Affiche Les infos du mécanicien
   */
  public void draw() {
    System.out.println("Mecancien: " + pv + ", " + force + "," + energie);
  }

}
