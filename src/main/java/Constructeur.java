class Constructeur extends Personnage {

  public Constructeur(int pv, int force, int energie) {
    this.pv = pv;
    this.force = force;
    this.energie = energie;
    this.minDamage = -3;
    this.maxDamage = +4;
  }

  /**
   * Permet de setter la vie.
   * @param pv  PV
   */
  public void setPV(int pv) {
    this.pv = pv;
  }

  /**
   * Affiche Les infos du constructeurs
   */
  public void draw() {
    System.out.println("Constructeur: " + pv + ", " + force + "," + energie);
  }

}
