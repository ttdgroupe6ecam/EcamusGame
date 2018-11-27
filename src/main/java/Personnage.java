import java.util.Random;

public abstract class Personnage {

    protected int pv;
    protected int force;
    protected int energie = 100;
    protected int defense = 0;
    protected int minDamage = 5;
    protected int maxDamage = 10;
    protected boolean mort;

    public boolean getMort(){
        return mort;
    }
    public void setMort(){
        this.mort = true;
    }

    public int attaquer()
    {
        this.energie =- 40;
        Random rand = new Random();
        int degats = (rand.nextInt(maxDamage - minDamage + 1) + minDamage);// * force/10;
        return degats;
    }

    public void subir(int degats)
    {
        int newPV = (this.getPV()- (degats * (100 - defense)/100 ));

        this.setPV(newPV);

        if (newPV <= 0)
        {
            this.setPV(0);
            this.setMort();
        }
        this.defense = 0;
    }

    public void gainEnergy()
    {
        this.energie =+ 15;
    }

    public int showEnergy()
    {
        return this.energie;
    }


    public int getPV(){
        return this.pv;
    }

    protected void setPV(int pv) {
    }
    public void parer(){
        this.energie =- 15;
        this.defense = 70;
    };

    public abstract void draw();

}