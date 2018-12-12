/**
 * Mecanicien class.
 * @author MediaMonster
 */
public class Mecanicien extends Personnage {

    /**
     * 
     * @param pv
     * @param force
     * @param energie
     * @param mort 
     */
  public Mecanicien(final int pv, final int force, final int energie, final boolean mort) {
    super(pv, force, mort);
    this.energie = energie;
    this.minDamage = +2;
    this.maxDamage = +2;
  }
}


