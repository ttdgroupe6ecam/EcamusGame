import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arene {


    public static List<Decorator> listPersonnages = new ArrayList<Decorator>() ;

    //build the arena
    public  void buildArena(){

    }

    // chose warriors and their weapons.
    public static void BuildFight(){

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
                    Decorator personnage = new sourisDecorator(new Informaticien(80,24,100));
                    personnage.draw();
                    listPersonnages.add(personnage);
                    System.out.println(listPersonnages);
                }
                if (str2 == 2) {
                    Decorator personnage = new cleMoletteDecorator(new Informaticien(80,24,100));
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
                    Decorator personnage = new sourisDecorator(new Electronicien(80,24,100));
                    personnage.draw();
                    listPersonnages.add(personnage);
                    System.out.println(listPersonnages);
                }
                if (str2 == 2) {
                    Decorator personnage = new cleMoletteDecorator(new Electronicien(80,24,100));
                    personnage.draw();
                    listPersonnages.add(personnage);
                    System.out.println(listPersonnages);

                }
            }

            x=x+1;
        }

    }

    // start the fight and return the winner
    public static void startFight(Decorator personnage1, Decorator personnage2){

        while (true){

            int degats = personnage1.getPersonnage().attaquer();
            personnage2.subir(degats);

            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }


            int degats2 = personnage2.getPersonnage().attaquer();
            personnage1.subir(degats2);

            System.out.println("PV restant Joueur 1 : " + personnage1.getPV());
            System.out.println("PV restant Joueur 2 : " + personnage2.getPV());

            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

            if (personnage1.getMort() == true)
            {
                System.out.print("Le Vainqueur est : Joueur 2");
                break;
            }
            else if(personnage2.getMort() == true)
            {
                System.out.print("Le Vainqueur est : Joueur 1");
                break;
            }

            //System.out.print(personnage1.getPV());
        }
    }
}