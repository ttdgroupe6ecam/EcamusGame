import javax.swing.*;



import java.util.Random;
import java.util.*;


public class main {

    public static class Arena {


        private Personnage personnage1;
        private Personnage personnage2;
        private static Personnage winner;
        private static Personnage loser;

        public Arena(Personnage winner, Personnage loser,Personnage personnage1 ,Personnage personnage2) {
            this.winner = winner;
            this.loser = loser;
            this.personnage1 = personnage1;
            this.personnage2 =personnage2;
        }


        //build the arena
        public  void buildArena(){

        }


        public static void setWinner(Personnage personnage){

            winner = personnage;
        }

        public static  Personnage getWinner(){

            return winner;
        }

        // chose warriors and their weapons.
        public static List<Personnage> buildFight(){

            List<Personnage> listPersonnages = new ArrayList<Personnage>() ;

            System.out.println("Bienvenue sur Ecamus");
            int x=0;
            while (x<2){
                if (x ==1) {
                    System.out.println(listPersonnages);
                    System.out.println("Choissisez un adversaire :");
                }
                System.out.println("Tapez : 1 -> informaticien" +" "+
                        " 2 -> Electronicien ");

                Scanner sc = new Scanner(System.in);
                int str = Integer.parseInt(sc.nextLine());
                if (str == 1) {
                    System.out.println("Tapez: 1 -> souris" + " " +
                            " 2 -> clé à molette");
                    Scanner sc2 = new Scanner(System.in);
                    int str2 = Integer.parseInt(sc2.nextLine());
                    if (str2 == 1) {
                        Personnage personnage = new sourisDecorator(new Informaticien(80, 24, 100));
                        personnage.draw();
                        listPersonnages.add(personnage);
                        System.out.println(listPersonnages);
                    }
                    if (str2 == 2) {
                        Personnage personnage = new cleMoletteDecorator(new Informaticien(80, 24, 100));
                        personnage.draw();
                        listPersonnages.add(personnage);
                        System.out.println(listPersonnages);

                    }
                }

                if (str == 2) {
                    System.out.println("Tapez: 1 -> souris" + " " +
                            " 2 -> clé à molette");
                    Scanner sc2 = new Scanner(System.in);
                    int str2 = Integer.parseInt(sc2.nextLine());
                    if (str2 == 1) {
                        Personnage personnage = new sourisDecorator(new Electronicien(80, 24, 100));
                        personnage.draw();
                        listPersonnages.add(personnage);
                        System.out.println(listPersonnages);
                    }
                    if (str2 == 2) {
                        Personnage personnage = new cleMoletteDecorator(new Electronicien(80, 24, 100));
                        personnage.draw();
                        listPersonnages.add(personnage);
                        System.out.println(listPersonnages);

                    }
                }

                x=x+1;


            }

            return listPersonnages ;
        }

        // start the fight and return the winner
        public static Personnage startFight(Personnage personnage1, Personnage personnage2){

            while (personnage1.getPV() > 0 && personnage2.getPV() >0 ){

                int degats = personnage1.attaquer();
                personnage2.subir(degats);

                degats = personnage2.attaquer();
                personnage1.subir(degats);
            }

            if(personnage1.getMort()== true){

                setWinner(personnage2);

            }
            if(personnage2.getMort()== true ){

                setWinner(personnage1);
            }
            return getWinner();
        }

    }

    public static abstract class Personnage {

        protected int pv;
        protected int force;
        protected int energie;
        protected int minDamage;
        protected int maxDamage;
        protected boolean mort;

        public int getPV(){
            return pv;
        }

        public boolean getMort(){
            return this.mort;
        }
        public void setMort(){
            this.mort = true;
        }
        public int attaquer()
        {
            Random rand = new Random();
            int degats = rand.nextInt(maxDamage - minDamage + 1) + minDamage;

            return degats;

        }

        public void subir(int degats)
        {
            this.pv = this.pv - degats;

            if (this.pv < 0)
            {
                this.setMort();
            }
        }

        public abstract void parer();

        public abstract void draw();

    }

    static class Informaticien extends Personnage {
        private int minDamage;
        private int maxDamage;

        public Informaticien(int pv, int force, int energie) {
            this.pv = pv;
            this.force = force;
            this.energie = energie;
            this.minDamage = minDamage;
            this.maxDamage = maxDamage;
        }

        public int getPV(){
            return pv;
        }
        public void draw() {
            System.out.println("Informaticien: " +"Point de vie :" + pv + " Force : " + force + " Energie :" + energie );
        }

        public void parer(){
            force=-1;
        }

    }
    static class Electronicien extends Personnage {
        private int minDamage;
        private int maxDamage;

        public Electronicien(int pv, int force,int energie) {
            this.pv = pv;
            this.force = force;
            this.energie = energie;
            this.minDamage = minDamage;
            this.maxDamage = maxDamage;
        }
        public int getPV(){
            return pv;
        }
        public void draw() {
            System.out.println("Electronicien: " + pv + ", " + force + "," + energie );
        }

        public void parer(){
            force=-1;
        }

    }
    static class Mecanicien extends Personnage {
        private int minDamage;
        private int maxDamage;

        public Mecanicien(int pv, int force, int energie) {
            this.pv = pv;
            this.force = force;
            this.energie = energie;
            this.minDamage = minDamage;
            this.maxDamage = maxDamage;
        }
        public int getPV(){
            return pv;
        }

        public void draw() {
            System.out.println("Mecancien: " + pv + ", " + force + "," + energie );
        }

        public void parer(){
            force=-1;
        }
    }
    static class Geometre extends Personnage {

        private int minDamage;
        private int maxDamage;

        public Geometre(int pv, int force,int energie) {
            this.pv = pv;
            this.force = force;
            this.energie = energie;
            this.minDamage = minDamage;
            this.maxDamage = maxDamage;
        }
        public int getPV(){
            return pv;
        }

        public void draw() {
            System.out.println("Geometre: " + pv + ", " + force + "," + energie );
        }

        public void parer(){
            force=-1;
        }

    }
    static class Constructeur extends Personnage {
        private int minDamage;
        private int maxDamage;

        public Constructeur(int pv, int force, int energie) {
            this.pv = pv;
            this.force = force;
            this.energie = energie;
            this.minDamage = minDamage;
            this.maxDamage = maxDamage;
        }
        public int getPV(){
            return pv;
        }

        public void draw() {
            System.out.println("Constructeur: " + pv + ", " + force + "," + energie );
        }

        public void parer(){
            force=-1;
        }

    }
    static class Automaticien extends Personnage {
        private int minDamage;
        private int maxDamage;

        public Automaticien(int pv, int force, int energie) {
            this.pv = pv;
            this.force = force;
            this.energie = energie;
            this.minDamage = minDamage;
            this.maxDamage = maxDamage;
        }
        public int getPV(){
            return pv;
        }

        public void draw() {
            System.out.println("Automaticien: " + pv + ", " + force + "," + energie );
        }

        public void parer(){
            force=-1;
        }
    }


    abstract static class Decorator extends Personnage {

        private Personnage personnage;

        public Decorator(Personnage personnage) {
            this.personnage = personnage;
        }

        public void draw() {
            personnage.draw();
        }

        public int getPV(){
            return personnage.getPV();
        }
    }

    static class sourisDecorator extends Decorator {
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
        public int attaquer(){
            System.out.println("Vous avez attaqué");
            return super.attaquer();
        }
    }
    static class cleMoletteDecorator extends Decorator {
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
        public int attaquer(){
            System.out.println("Vous avez attaqué");
            return super.attaquer();
        }
    }
    static class equerreDecorator extends Decorator {
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
        public int attaquer(){
            System.out.println("Vous avez attaqué");
            return super.attaquer();
        }
    }
    static class arduinoDecorator extends Decorator {
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
        public int attaquer(){
            System.out.println("Vous avez attaqué");
            return super.attaquer();
        }
    }
    static class marteauDecorator extends Decorator {
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
        public int attaquer(){
            System.out.println("Vous avez attaqué");
            return super.attaquer();
        }
    }


    public static void main(String[] args) {

        Screen s = new Screen();
        JFrame window = s.window;

        List<Personnage> listOfPersonnages = Arena.buildFight(); // on récupère les deux personnages construits
        Personnage personnage1 = listOfPersonnages.get(0); // on les place dans des variables
        Personnage personnage2 = listOfPersonnages.get(1);
        Arena.startFight(personnage1 , personnage2); // on lance le combat


    }

}










