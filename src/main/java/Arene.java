package main.java;

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
            int flag=0;
            while (x<2){
                if (x ==1) {

                    System.out.println("Choisissez un adversaire :");
                }
                System.out.println("Tapez : 1 -> informaticien" +" "+
                        " 2 -> Electronicien, 9->quitter ");

                Scanner sc = new Scanner(System.in);
                int str = Integer.parseInt(sc.nextLine());
                if (str == 1) {
                    System.out.println("Tapez: 1 -> souris" + " " +
                            " 2 -> clé à molette");
                    Scanner sc2 = new Scanner(System.in);
                    int str2 = Integer.parseInt(sc2.nextLine());
                    if (str2 == 1) {
                        Decorator personnage = new sourisDecorator(new Informaticien(100,24,100));
                        personnage.draw();
                        listPersonnages.add(personnage);
                        System.out.println(listPersonnages);
                    }
                    if (str2 == 2) {
                        Decorator personnage = new cleMoletteDecorator(new Informaticien(100,24,100));
                        System.out.println(">>>>>> " + personnage.showEnergy());
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
                        Decorator personnage = new sourisDecorator(new Electronicien(100, 24, 100));
                        personnage.draw();
                        listPersonnages.add(personnage);
                        System.out.println(listPersonnages);
                    }
                    if (str2 == 2) {
                        Decorator personnage = new cleMoletteDecorator(new Electronicien(100, 24, 100));
                        personnage.draw();
                        listPersonnages.add(personnage);
                        System.out.println(listPersonnages);

                    }
                }
                if (str == 9) {
                    System.exit(1);
                }


                x=x+1;
            }
            Arene.startFight(Arene.listPersonnages.get(0) , Arene.listPersonnages.get(1)); // on lance le combat




    }

    // start the fight and return the winner
    public static void startFight(Decorator personnage1, Decorator personnage2){

        while (true){

            System.out.println("Joueur 1 : 1 -> attaquer , 2-> parer , 3-> prendre la fuite");
            System.out.println("Joueur 1 : Energie = " + personnage1.showEnergy() + " / PV = " + personnage1.getPV());
            Scanner sc3 = new Scanner(System.in);
            int str3 = Integer.parseInt(sc3.nextLine());
            if (str3==1) {
                int degats = personnage1.getPersonnage().attaquer();
                personnage2.subir(degats);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            else if(str3==2)
            {
                //int esquive = personnage1.getPersonnage().parer();
                //personnage2.subir(esquive);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            else if (str3==3)
            {
                //int esquive = personnage1.getPersonnage().parer();
                //personnage2.subir(esquive);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("PV restant Joueur 2 : " + personnage2.getPV());
            if(personnage2.getMort() == true)
            {
                System.out.println("Le Vainqueur est : Joueur 1");
                listPersonnages.clear();
                break;
            }

            System.out.println("Joueur 2 : 1 -> attaquer , 2-> parer , 3-> prendre la fuite");
            //System.out.println("Joueur 2 : Energie = " + personnage2.showEnergy() + " / PV = " + personnage2.getPV());
            Scanner sc4 = new Scanner(System.in);
            int str4 = Integer.parseInt(sc4.nextLine());
            if (str4==1) {
                int degats2 = personnage2.getPersonnage().attaquer();
                personnage1.subir(degats2);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            else if(str4==2)
            {
                //int esquive = personnage1.getPersonnage().parer();
                //personnage2.subir(esquive);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            else if (str4==3)
            {
                //int esquive = personnage1.getPersonnage().parer();
                //personnage2.subir(esquive);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }



            System.out.println("PV restant Joueur 1 : " + personnage1.getPV());



            if (personnage1.getMort() == true)
            {
                System.out.println("Le Vainqueur est : Joueur 2");
                listPersonnages.clear();
                break;
            }



        }

        BuildFight();
    }
}