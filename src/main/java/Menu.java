
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
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** @author UserAdmin */
/** I creat a Menu that will pop - up after the Opening screen and will,
 * contain,
 *Button to start or exit the interface,
 *for that I've created a new frame call,
 *window and set is size and make it visible on the screen , I alsoe created,
 *2 button , one exit/one play.
 */
/**
 * creation d'objet pour l'interface.
 */
public class Menu extends JPanel implements ActionListener, KeyListener {
  /**
   * the path of the current folder.
   */
  private String path = Paths.get(".").toAbsolutePath().normalize().toString();

    /**
     * Fenetre.
     */
  private JFrame window = new JFrame();
    /**
     * Bouton.
     */
  private JButton playButton = new JButton();
    /**
     * Bouton.
     */
  private JButton exitButton = new JButton();
    /**
     * Arriere plan.
     */
  private JLabel background = new JLabel();
  /**
   * le path du son.
   */
  private File sound =
      new File(
          path + "/src/main/resources/Title_Screen.wav");
  /* Bien entrer le bon chemin d'acces du son */
  /**
   * a class used for the audio iunput.
   */
  private AudioInputStream ais;
  /**
   * a class used to handle clips.
   */
  private Clip clip1;

  /**
   * creation de la page d'accueil.
   * @throws UnsupportedAudioFileException audio can't reas file
   * @throws IOException io can't access file
   * @throws LineUnavailableException issue
   */
  Menu() throws UnsupportedAudioFileException, IOException,
          LineUnavailableException {
      this.ais = AudioSystem.getAudioInputStream(sound);
      this.clip1 = AudioSystem.getClip();
      this.setBackground(Color.DARK_GRAY);
      this.setForeground(Color.DARK_GRAY);
      window.add(this);
      playButton.setBackground(Color.DARK_GRAY);
      playButton.setIcon(new ImageIcon(path
              + "/src/main/resources/Vulcania.jpg"));
      /* Bien entrer le bon chemin d'acces de l'image */
      playButton.addActionListener(this);
      playButton.addKeyListener(this);
      window.add(playButton, BorderLayout.PAGE_START);
      exitButton.setBackground(Color.DARK_GRAY);
      exitButton.setIcon(new ImageIcon(path
              + "/src/main/resources/Exit_Button.png"));
      /* Bien entrer le bon chemin d'acces de l'image */
      exitButton.addActionListener(this);
      exitButton.addKeyListener(this);
      window.add(exitButton, BorderLayout.PAGE_END);
      background.setIcon(new ImageIcon(path
              + "/src/main/resources/Gladiador.jpg"));
      /* Bien entrer le bon chemin d'acces de l'image */
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
  }

  @Override
  public final void actionPerformed(final ActionEvent ae) {
    if (ae.getSource() == getExitButton()) {
      // clip1.close();
            getWindow().dispose();
      System.exit(0);

    } else if (ae.getSource() == getPlayButton()) {
            getWindow().dispose();
            this.getClip1().close();
      try {
         new Arena();
      } catch (LineUnavailableException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  @Override
  public final void keyTyped(final KeyEvent e) { }

  @Override
  public final void keyPressed(final KeyEvent kp) {
    if (kp.getKeyCode() == KeyEvent.VK_ESCAPE) {
            getWindow().dispose();
    }
  }

  @Override
  public final void keyReleased(final KeyEvent e) {
    System.exit(0);
    throw new UnsupportedOperationException("Not supported yet.");
// To change body of generated methods, choose Tools | Templates.
  }
  /**
   * path getter.
   * @return the path
   */
  public final String getPath() {
      return path;
  }
  /**
   * path setter.
   * @param pathParam the path to set
   */
  public final void setPath(final String pathParam) {
      this.path = pathParam;
  }
  /**
   * window getter.
   * @return the window
   */
  public final JFrame getWindow() {
      return window;
  }
  /**
   * window setter.
   * @param windowParam the window to set
   */
  public final void setWindow(final JFrame windowParam) {
      this.window = windowParam;
  }
  /**
   * playButoon getter.
   * @return the playButton
   */
  public final JButton getPlayButton() {
      return playButton;
  }
  /**
   * playButton setter.
   * @param playButtonParam the playButton to set
   */
  public final void setPlayButton(final JButton playButtonParam) {
      this.playButton = playButtonParam;
  }
  /**
   * exitButton getter.
   * @return the exitButton
   */
  public final JButton getExitButton() {
      return exitButton;
  }
  /**
   * exitButton setter.
   * @param exitButtonParam the exitButton to set
   */
  public final void setExitButton(final JButton exitButtonParam) {
      this.exitButton = exitButtonParam;
  }
  /**
   * backgroung setter.
   * @param backgroundParam the background to set
   */
  public final void setBackground(final JLabel backgroundParam) {
      this.background = backgroundParam;
  }
  /**
   * sound getter.
   * @return the sound
   */
  public final File getSound() {
      return sound;
  }
  /**
   * sound setter.
   * @param soundParam the sound to set
   */
  public final void setSound(final File soundParam) {
      this.sound = soundParam;
  }
  /**
   * ais getter.
   * @return the ais
   */
  public final AudioInputStream getAis() {
      return ais;
  }
  /**
   * ais setter.
   * @param aisParam the ais to set
   */
  public final void setAis(final AudioInputStream aisParam) {
      this.ais = aisParam;
  }
  /**
   * clip getter.
   * @return the clip1
   */
  public final Clip getClip1() {
      return clip1;
  }
  /**
   * clip setter.
   * @param clip1Param the clip1 to set
   */
  public final void setClip1(final Clip clip1Param) {
      this.clip1 = clip1Param;
  }
}
