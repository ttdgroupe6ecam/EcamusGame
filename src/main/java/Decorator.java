package main.java;


public abstract class Decorator extends Personnage {

    protected Personnage personnage;

    public Decorator(Personnage personnage) {
        this.personnage = personnage;
    }

    public void draw(){}

    public void setPV(int pv ){
        this.personnage.setPV(pv);
    }

    public Personnage getPersonnage(){
        return personnage;
    }

    public int getPV(){
        return personnage.getPV();
    }
}

class sourisDecorator extends Decorator {
    //Constuct
    public sourisDecorator(Personnage personnage) {
        super(personnage);
    }

    public void draw() {

        super.draw();
        System.out.println(" Equipé d'une Souris");
    }

    public void mourir(){
        System.out.println("Vous êtes mort");
    }
    public void parer(){
        System.out.println("Vous avez paré");
    }

}

class cleMoletteDecorator extends Decorator {
    public cleMoletteDecorator(Personnage personnage) {
        super(personnage);
    }
    public void draw() {
        super.draw();
        System.out.println(" Equipé d'une Clé à molette");
    }
    public void mourir(){
        System.out.println("Vous êtes mort");
    }
    public void parer(){
        System.out.println("Vous avez paré");
    }

}
class equerreDecorator extends Decorator {
    public equerreDecorator(Personnage personnage) {
        super(personnage);
    }
    public void draw() {
        super.draw();
        System.out.println(" Equipé d'une Equerre");
    }
    public void mourir(){
        System.out.println("Vous êtes mort");
    }
    public void parer(){
        System.out.println("Vous avez paré");
    }

}
class arduinoDecorator extends Decorator {
    public arduinoDecorator(Personnage personnage) {
        super(personnage);
    }
    public void draw() {
        super.draw();
        System.out.println("Equipé d'une Arduino");
    }
    public void mourir(){
        System.out.println("Vous êtes mort");
    }
    public void parer(){
        System.out.println("Vous avez paré");
    }

}
class marteauDecorator extends Decorator {
    public marteauDecorator(Personnage personnage) {
        super(personnage);
    }
    public void draw() {
        super.draw();
        System.out.println(" Equipé d'une Marteau");
    }
    public void mourir(){
        System.out.println("Vous êtes mort");
    }
    public void parer(){
        System.out.println("Vous avez paré");
    }

}