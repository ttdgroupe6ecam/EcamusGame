import java.util.ArrayList;
import java.util.List;
/**
 * this is thc class that contains the setup method for the game and,
 * the one to play the game.
 * @author venon arthur
 */
public final class Arene {
  /**
   * A static list that contains all the characters played by the users.
   */
  private static List<Decorator> listPersonnages = new ArrayList<Decorator>();
  /**
   * non called contructor.
   */
  private Arene() {

  }
  /**
   * Declaration de l'interface en invite de commande,
   * Permet de choisir son personnage et son arme.
   * @param asker the class to handle user inputs
   */
  public static void buildFight(final AskString asker) {

    System.out.println("Bienvenue sur Ecamus");
    int x = 0;

    //x indique le nombre de joueurs, maximum 2
    while (x < 2) {
      if (x == 1) {

        System.out.println("Choisissez un adversaire :");
      }
      int str = asker.askInt("1 -> informaticien 2 -> Electronicien, 9->quitter ");

      if (str == 1) {
        int str2 = asker.askInt("Tapez: 1 -> souris " + " 2 -> clé à molette");
        if (str2 == 1) {
          Decorator personnage;
            personnage = new SourisDecorator(new Informaticien(100, 24));
          listPersonnages.add(personnage);
          System.out.println(listPersonnages);
        }
        if (str2 == 2) {
          Decorator personnage;
            personnage = new CleMoletteDecorator(new Informaticien(100, 24));
          listPersonnages.add(personnage);
          System.out.println(listPersonnages);
        }
      }

      if (str == 2) {
        int str2 = asker.askInt("Tapez: 1 -> souris " + " 2 -> clé à molette");
        if (str2 == 1) {
          Decorator personnage;
            personnage = new SourisDecorator(new Electronicien(100, 24));
          listPersonnages.add(personnage);
          System.out.println(listPersonnages);
        }
        if (str2 == 2) {
          Decorator personnage;
            personnage = new CleMoletteDecorator(new Electronicien(100, 24));
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
    startFight(Arene.listPersonnages.get(0), Arene.listPersonnages.get(1),new AskString(System.in, System.out));
// on lance le combat
  }

    /**
     * Commence le combat entre les 2 personnages,
     * Interface en invite de commande, permet de choisir les actions.
     * @param personnage1 the fisrt personnage to be played
     * @param personnage2 the second personnage to be played
     * @param asker the clss to handle user inputs
     */
  public static void startFight(final Decorator personnage1,
          final Decorator personnage2, final AskString asker) {

    while (true) {

      int str3 = asker.askInt("Joueur 1 : 1 -> attaquer , 2-> parer ");
      System.out.println(
          "Joueur 1 : Energie = " + personnage1.showEnergy() + " / PV = "
                  + personnage1.getPV());
      personnage1.resetDefense();

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

      int str4 = asker.askInt("Joueur 2 : 1 -> attaquer , 2-> parer ");
      System.out.println("Joueur 2 : Energie =" + personnage2.showEnergy()
              + "/ PV ="
              + personnage2.getPV());
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
    buildFight(new AskString(System.in, System.out));
  }
}
