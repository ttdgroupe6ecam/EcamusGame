import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.file.Paths;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** @author UserAdmin */
/* I creat a Menu that will pop - up after the Opening screen , and will contain
Button to start or exit the interface game , for that I've created a new frame call
window and set is size and make it visible on the screen , I alsoe created
2 button , one exit/one play
*/
/**
 * creation d'objet pour l'interface.
 */
public class Menu extends JPanel implements ActionListener, KeyListener {

  String path = Paths.get(".").toAbsolutePath().normalize().toString();

    /**
     * Fenetre.
     */
  JFrame window = new JFrame();
    /**
     * Bouton.
     */
  JButton playButton = new JButton();
    /**
     * Bouton.
     */
  JButton exitButton = new JButton();
    /**
     * Arriere plan.
     */
  JLabel background = new JLabel();
  File sound =
      new File(
          path+"/resources/Title_Screen.wav"); /* Bien entrer le bon chemin d'acces du son */
  AudioInputStream ais;
  Clip clip1;

  /**
   * Création de la page d'accueil.
   */
  Menu() throws UnsupportedAudioFileException, IOException {
    try {

      this.ais = AudioSystem.getAudioInputStream(sound);
      this.clip1 = AudioSystem.getClip();
      this.setBackground(Color.DARK_GRAY);
      this.setForeground(Color.DARK_GRAY);
      window.add(this);
      playButton.setBackground(Color.DARK_GRAY);
      playButton.setIcon(
          new ImageIcon(
              path+"/resources/Vulcania.jpg")); /* Bien entrer le bon chemin d'acces de l'image */
      playButton.addActionListener(this);
      playButton.addKeyListener(this);
      window.add(playButton, BorderLayout.PAGE_START);
      exitButton.setBackground(Color.DARK_GRAY);
      exitButton.setIcon(
          new ImageIcon(
              path+"/resources/Exit_Button.png")); /* Bien entrer le bon chemin d'acces de l'image */
      exitButton.addActionListener(this);
      exitButton.addKeyListener(this);
      window.add(exitButton, BorderLayout.PAGE_END);
      background.setIcon(
          new ImageIcon(
              path+"/resources/Gladiador.jpg")); /* Bien entrer le bon chemin d'acces de l'image */
      window.getContentPane().add(background);
      window.setUndecorated(true);
      window.setSize(800, 700);
      window.setVisible(true);
      try {

        clip1.open(ais);

        clip1.setMicrosecondPosition(20000000);
        clip1.start();

      } catch (Exception e) {
        System.out.println(e);
      }

    } catch (LineUnavailableException ex) {
      Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  @Override
  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == exitButton) {
      // clip1.close();
      window.dispose();
      System.exit(1);

    } else if (ae.getSource() == playButton) {
      window.dispose();
      this.clip1.close();

      try {
        Arena a = new Arena();
      } catch (LineUnavailableException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  @Override
  public void keyTyped(KeyEvent e) { }

  @Override
  public void keyPressed(KeyEvent kp) {
    if (kp.getKeyCode() == KeyEvent.VK_ESCAPE) {
      window.dispose();
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    throw new UnsupportedOperationException(
        "Not supported yet."); // To change body of generated methods, choose Tools | Templates.
  }
}
