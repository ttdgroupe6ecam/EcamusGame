import java.util.Random;

public abstract class Personnage {

    protected int pv;
    protected int force;
    protected int energie;
    protected int minDamage = 5;
    protected int maxDamage = 10;
    protected boolean mort;

    public boolean getMort(){
        return mort;
    }
    public void setMort(){
        mort = true;
    }

    public int attaquer()
    {
        Random rand = new Random();
        int degats = rand.nextInt(maxDamage - minDamage + 1) + minDamage;
        return degats;
    }

    public void subir(int degats)
    {
        int newPV = (this.getPV()- degats);

        this.setPV(newPV);
        //System.out.println("resultat de subir : " + degats);

        if (newPV <= 0)
        {
            this.setMort();
        }
    }

    public int getPV(){
        return this.pv;
    }

    protected void setPV(int pv) {
    }
    public abstract void parer();

    public abstract void draw();

}