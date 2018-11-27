

public class Informaticien extends Personnage {

    public Informaticien(int pv, int force, int energie) {
        this.pv = pv;
        this.force = force;
        this.energie = energie;
        this.maxDamage = 50;
    }

    public void setPV(int pv){
        this.pv = pv;
    }

    public void draw() {
        System.out.println("Informaticien: " +"Point de vie :" + pv + " Force : " + force + " Energie :" + energie );
    }

    public void parer(){
        force=-1;
    }

}
