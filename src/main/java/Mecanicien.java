/**
 * Mecanicien class.
 * @author MediaMonster
 */
public class Mecanicien extends Personnage {

    /**
     * @param pv **point de vie **
     * @param force ** la force  **
     * @param energie **l'énergie **
     * @param mort ** mort oui ou non **
     */
  public Mecanicien(final int pv, final int force, final int energie,
          final boolean mort) {
    super(pv, force, mort);
    this.energie = energie;
    this.minDamage = +2;
    this.maxDamage = +2;
  }
}
