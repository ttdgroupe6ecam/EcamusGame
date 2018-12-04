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
Button to start or exit the interface game , 
for that I've created a new frame call
window and set is size and make it visible on the screen , I alsoe created
2 button , one exit/one play
*/
/**
 * creation d'objet pour l'interface.
 */
public class Menu extends JPanel implements ActionListener, KeyListener {

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
  private File sound =
      new File(
          path + "/resources/Title_Screen.wav");
  /* Bien entrer le bon chemin d'acces du son */
  private AudioInputStream ais;
  private Clip clip1;

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
      playButton.setIcon(new ImageIcon(
              getPath() + "/resources/Vulcania.jpg")); 
      /* Bien entrer le bon chemin d'acces de l'image */
      playButton.addActionListener(this);
      playButton.addKeyListener(this);
      window.add(playButton, BorderLayout.PAGE_START);
      exitButton.setBackground(Color.DARK_GRAY);
      exitButton.setIcon(new ImageIcon(
              getPath() + "/resources/Exit_Button.png")); 
      /* Bien entrer le bon chemin d'acces de l'image */
      exitButton.addActionListener(this);
      exitButton.addKeyListener(this);
      window.add(exitButton, BorderLayout.PAGE_END);
      background.setIcon(new ImageIcon(
              getPath() + "/resources/Gladiador.jpg"));
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

    } catch (LineUnavailableException ex) {
      Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  @Override
  public final void actionPerformed(final ActionEvent ae) {
    if (ae.getSource() == getExitButton()) {
      // clip1.close();
            getWindow().dispose();
      System.exit(1);

    } else if (ae.getSource() == getPlayButton()) {
            getWindow().dispose();
            this.getClip1().close();

      try {
        Arena a = new Arena();
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
    throw new UnsupportedOperationException(
        "Not supported yet."); 
// To change body of generated methods, choose Tools | Templates.
  }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the window
     */
    public JFrame getWindow() {
        return window;
    }

    /**
     * @param window the window to set
     */
    public void setWindow(JFrame window) {
        this.window = window;
    }

    /**
     * @return the playButton
     */
    public JButton getPlayButton() {
        return playButton;
    }

    /**
     * @param playButton the playButton to set
     */
    public void setPlayButton(JButton playButton) {
        this.playButton = playButton;
    }

    /**
     * @return the exitButton
     */
    public JButton getExitButton() {
        return exitButton;
    }

    /**
     * @param exitButton the exitButton to set
     */
    public void setExitButton(JButton exitButton) {
        this.exitButton = exitButton;
    }

    

    /**
     * @param background the background to set
     */
    public void setBackground(JLabel background) {
        this.background = background;
    }

    /**
     * @return the sound
     */
    public File getSound() {
        return sound;
    }

    /**
     * @param sound the sound to set
     */
    public void setSound(File sound) {
        this.sound = sound;
    }

    /**
     * @return the ais
     */
    public AudioInputStream getAis() {
        return ais;
    }

    /**
     * @param ais the ais to set
     */
    public void setAis(AudioInputStream ais) {
        this.ais = ais;
    }

    /**
     * @return the clip1
     */
    public Clip getClip1() {
        return clip1;
    }

    /**
     * @param clip1 the clip1 to set
     */
    public void setClip1(Clip clip1) {
        this.clip1 = clip1;
    }
}
