public class Constructeur extends Personnage {

    public Constructeur(int pv, int force, int energie) {
        this.pv = pv;
        this.force = force;
        this.energie = energie;
        this.minDamage =- 3;
        this.maxDamage =+ 4;
    }

    public void setPV(int pv){
        this.pv = pv;
    }

    public void draw() {
        System.out.println("Constructeur: " + pv + ", " + force + "," + energie );
    }

    public void parer(){
        force=-1;
    }

}
