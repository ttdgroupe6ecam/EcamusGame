package main.java;

public class Geometre extends Personnage {

    public Geometre(int pv, int force,int energie) {
        this.pv = pv;
        this.force = force;
        this.energie = energie;
        this.minDamage =- 1;
        this.maxDamage =+ 2;
    }

    public void setPV(int pv){
        this.pv = pv;
    }

    public void draw() {
        System.out.println("Geometre: " + pv + ", " + force + "," + energie );
    }

    public void parer(){
        force=-1;
    }

}
