public class Automaticien extends Personnage {

  public Automaticien(final int pv,final int force,final int energie) {
    this.pv = pv;
    this.force = force;
    this.energie = energie;
    this.minDamage = +3;
    this.maxDamage = +1;
  }
}
