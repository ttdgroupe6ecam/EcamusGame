import java.util.Random;
/**
 * 
 * @author MediaMonster
 */
public abstract class Personnage {
    /**
     * Pv.
     */
    protected  int pv;
    /**
     * Force.
     */
    protected  int force;

    /**
     * Energie.
     */
    protected  int energie = 100;

    /**
     * Defense.
     */
    protected  int defense = 0;

    /**
     * minDamage.
     */
    protected  int minDamage = 5;

    /**
     * maxDamage.
     */
    protected  int maxDamage = 10;

    /**
     * mort.
     */
    protected  boolean mort;

    
    /**
     * constract
     */
    public Personnage() {
    }
    
    /**
     * 
     * @param pv
     * @param force
     * @param mort 
     */
    public Personnage(int pv, int force, boolean mort) {
        this.pv = pv;
        this.force = force;
        this.mort = mort;
    }

 

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getEnergie() {
        return energie;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    /**
     * Permet de recuperer le statut Mort du personnage.
     * @return mort Booléen du statut
     */

    public boolean getMort() {
        return mort;
    }

    /**
     * Permet de setter le statut Mort du personnage.
     */

    public void setMort() {
        this.mort = true;
    }

    /**
     * Methode d'attaque afin d'infliger des degats à l'adversaire.
     * degats aleatoire en fonction de maxDamage et minDamage
     * @return degats
     */
    public int attaquer() {
        this.energie -= 40;

        if (this.energie < 0) {
            System.out.println("Pas assez d'energie -> Attaque affaiblie");
            this.energie = 0;
            int degats = 5;
            return degats;
        }

        Random rand = new Random();
        int degats = (rand.nextInt(maxDamage - minDamage + 1) + minDamage); // * force/10;
        return degats;
    }

    /**
     * Methode permettant de subir les degats (Baisse les PV).
     * @param degats Nombre de degats subis par le personnage
     */
    public void subir(int degats) {
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
    public void gainEnergy() {
        this.energie += 25;
    }

    /**
     * Methode permettant de recuperer la valeur de energie du personnage.
     * @return energie valeur d'energie du personnage
     */
    public int showEnergy() {
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
     * @param pv Nouveau PV du personnage
     */
    public void setPV(int pv) {
        this.pv = pv;
    }

    /**
     * Permet de reduire les degats subis.
     */
    public void parer() {
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
     * reset la défense.
     */
    public void resetDefense() {
        this.defense = 0;
    };

}
