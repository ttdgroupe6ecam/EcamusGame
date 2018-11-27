public class Geometre extends Personnage {

  public Geometre(int pv, int force, int energie) {
    this.pv = pv;
    this.force = force;
    this.energie = energie;
    this.minDamage = -1;
    this.maxDamage = +2;
  }
}
