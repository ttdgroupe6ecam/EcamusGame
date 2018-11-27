class Constructeur extends Personnage {

  public Constructeur(int pv, int force, int energie) {
    this.pv = pv;
    this.force = force;
    this.energie = energie;
    this.minDamage = -3;
    this.maxDamage = +4;
  }

}
