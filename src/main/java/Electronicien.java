


class Electronicien extends Personnage {

    public Electronicien(int pv, int force,int energie) {
        this.pv = pv;
        this.force = force;
        this.energie = energie;
        //this.minDamage = 0;
    }

    public void setPV(int pv){
        this.pv = pv;
    }


    public void draw() {
        System.out.println("Electronicien: " + pv + ", " + force + "," + energie );
    }

    public void parer(){
        force=-1;
    }


}
