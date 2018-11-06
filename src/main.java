import javax.swing.*;


public class main {

    public static void main(String[] args) {

        Screen s = new Screen();
        JFrame window = s.window;

        Arene.BuildFight();
        Arene.startFight(Arene.listPersonnages.get(0) , Arene.listPersonnages.get(1)); // on lance le combat
    }
}