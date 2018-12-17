import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * this is thc class that contains the setup method for the game and,
 * the one to play the game.
 * @author venon arthur
 */
public class Arene {
  /**
   * A static list that contains all the characters played by the users.
   */
  private static List<Decorator> listPersonnages = new ArrayList<Decorator>();
  /**
   * Declaration de l'interface en invite de commande,
   * Permet de choisir son personnage et son arme.
   */
  public static void buildFight() {

    System.out.println("Bienvenue sur Ecamus");
    int x = 0;
    int flag = 0;

    //x indique le nombre de joueurs, maximum 2
    while (x < 2) {
      if (x == 1) {

        System.out.println("Choisissez un adversaire :");
      }
      System.out.println("Tapez : 1 -> informaticien " 
              +" 2 -> Electronicien, 9->quitter ");

      Scanner sc = new Scanner(System.in);

      //str représente le choix du personnage
      int str = Integer.parseInt(sc.nextLine());
      if (str == 1) {
        System.out.println("Tapez: 1 -> souris " + " 2 -> clé à molette");
        Scanner sc2 = new Scanner(System.in);

        //str2 représente le choix de l'arme
        int str2 = Integer.parseInt(sc2.nextLine());
        if (str2 == 1) {
          Decorator personnage;
            personnage = new sourisDecorator(new Informaticien(100, 24));
          listPersonnages.add(personnage);
          System.out.println(listPersonnages);
        }
        if (str2 == 2) {
          Decorator personnage;
            personnage = new cleMoletteDecorator(new Informaticien(100, 24));
          listPersonnages.add(personnage);
          System.out.println(listPersonnages);
        }
      }

      if (str == 2) {
        System.out.println("Tapez: 1 -> souris " + " 2 -> clé à molette");
        Scanner sc2 = new Scanner(System.in);
        int str2 = Integer.parseInt(sc2.nextLine());
        if (str2 == 1) {
          Decorator personnage;
            personnage = new sourisDecorator(new Electronicien(100, 24));
          listPersonnages.add(personnage);
          System.out.println(listPersonnages);
        }
        if (str2 == 2) {
          Decorator personnage;
            personnage = new cleMoletteDecorator(new Electronicien(100, 24));
          listPersonnages.add(personnage);
          System.out.println(listPersonnages);
        }
      }

      // 9 Pour quitter l'application
      if (str == 9) {
        System.exit(1);
      }

      x = x + 1;
    }
    Arene.startFight(Arene.listPersonnages.get(0),Arene.listPersonnages.get(1)); 
// on lance le combat
  }

    /**
     * Commence le combat entre les 2 personnages,
     * Interface en invite de commande, permet de choisir les actions.
     * @param personnage1 the fisrt personnage to be played
     * @param personnage2 the second personnage to be played
     */
  public static void startFight(final Decorator personnage1,
          final Decorator personnage2) {

    while (true) {

      System.out.println("Joueur 1 : 1 -> attaquer , 2-> parer ");
      System.out.println(
          "Joueur 1 : Energie = " + personnage1.showEnergy() + " / PV = "
                  + personnage1.getPV());
      personnage1.resetDefense();

      Scanner sc3 = new Scanner(System.in);
      int str3 = Integer.parseInt(sc3.nextLine());
      if (str3 == 1) {
        int degats = personnage1.attaquer();
        personnage2.subir(degats);

        try {
          Thread.sleep(500);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      } else if (str3 == 2) {
        personnage1.parer();
        System.out.println("Parade : Dégats subis réduits ce tour");

        try {
          Thread.sleep(500);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      }
      System.out.println("PV restant Joueur 2 : " + personnage2.getPV());

      //On vérifie si le personnage est mort suite aux dégats qu'il a subis
      if (personnage2.getMort()) {
        System.out.println("Le Vainqueur est : Joueur 1");
        listPersonnages.clear();
        break;
      }

      System.out.println("Joueur 2 : 1 -> attaquer , 2-> parer ");
      System.out.println("Joueur 2 : Energie =" + personnage2.showEnergy()
              + "/ PV ="
              + personnage2.getPV());
      Scanner sc4 = new Scanner(System.in);
      int str4 = Integer.parseInt(sc4.nextLine());
      personnage2.resetDefense();

      if (str4 == 1) {
        int degats2 = personnage2.attaquer();
        personnage1.subir(degats2);

        try {
          Thread.sleep(500);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      } else if (str4 == 2) {
        personnage2.parer();
        System.out.println("Parade : Dégats subis réduits ce tour");

        try {
          Thread.sleep(500);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      }

      System.out.println("PV restant Joueur 1 : " + personnage1.getPV());

      //On vérifie si le personnage est mort suite aux dégats qu'il a subis
      if (personnage1.getMort()) {
        System.out.println("Le Vainqueur est : Joueur 2");
        listPersonnages.clear();
        break;
      }
      personnage1.gainEnergy();
      personnage2.gainEnergy();
    }
    BuildFight();
  }
}
