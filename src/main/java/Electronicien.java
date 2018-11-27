class Electronicien extends Personnage {

  public Electronicien(int pv, int force) {
    this.pv = pv;
    this.force = force;
    // this.minDamage = 0;
  }

  /**
   * Permet de setter la vie.
   * @param pv  PV
   */
  public void setPV(int pv) {
    this.pv = pv;
  }

  /**
   * Affiche Les infos de l'électronicien
   */
  public void draw() {
    System.out.println("Electronicien: " + pv + ", " + force + "," + energie);
  }

}
