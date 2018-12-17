import java.util.Random;
/**
 * the personnage class.
 * @author venon arthur
 */
public abstract class Personnage {
    /**
     * Pv.
     */
    protected int pv;
    /**
     * Force.
     */
    protected int force;

    /**
     * Energie.
     */
    protected int energie = 100;

    /**
     * Defense.
     */
    protected int defense = 0;

    /**
     * minDamage.
     */
    protected int minDamage = 5;

    /**
     * maxDamage.
     */
    protected int maxDamage = 10;

    /**
     * mort.
     */
    protected boolean mort;

    /**
     * Permet de recuperer le statut Mort du personnage.
     * @return mort Booléen du statut
     */

    public final boolean getMort() {
        return mort;
    }

    /**
     * Permet de setter le statut Mort du personnage.
     */

    final void setMort() {
        this.mort = true;
    }

    /**
     * Methode d'attaque afin d'infliger des degats à l'adversaire.
     * degats aleatoire en fonction de maxDamage et minDamage
     * @return degats
     */

    public final int attaquer() {
        this.energie -= 40;

        if (this.energie < 0) {
            System.out.println("Pas assez d'energie -> Attaque affaiblie");
            this.energie = 0;
            int degats = 5;
            return degats;
        }

        Random rand = new Random();
        int degats = (rand.nextInt(maxDamage - minDamage + 1) + minDamage);
        // * force/10;
        return degats;
    }

    /**
     * Methode permettant de subir les degats (Baisse les PV).
     * @param degats Nombre de degats subis par le personnage
     */
    public final void subir(final int degats) {
        int newPV = (this.getPV() - (degats * (100 - defense) / 100));

        this.setPV(newPV);

        //
        if (newPV <= 0) {
            this.setPV(0);
            this.setMort();
        }
        resetDefense();
    }

    /**
     * Methode permettant de recuperer de l'energie.
     */
    public final void gainEnergy() {
        this.energie += 25;
    }

    /**
     * Methode permettant de recuperer la valeur de energie du personnage.
     * @return energie valeur d'energie du personnage
     */
    public final int showEnergy() {
        return this.energie;
    }

    /**
     * Permet de récuperer les points de vie du personnage.
     * @return pv int des points de vie
     */
    public int getPV() {
        return this.pv;
    }


    /**
     * Permet de setter les points de vie du personnage.
     * @param pvParam Nouveau PV du personnage
     */
    public void setPV(final int pvParam) {
        this.pv = pvParam;
    }

    /**
     * Permet de reduire les degats subis.
     */
    public final void parer() {
        this.energie -= 15;

        if (this.energie < 0) {
            System.out.println("Pas assez d'energie -> Parade affaiblie");
            this.energie = 0;
            this.defense = 30;
        } else {
            this.defense = 70;
        }
    }

    /**
     * reset la defense.
     */
    public final void resetDefense() {
        this.defense = 0;
    };
}
