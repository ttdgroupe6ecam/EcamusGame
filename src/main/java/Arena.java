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
public class Arena extends JPanel implements ActionListener, KeyListener {
  /**
   * the path of the current folder.
   */
  private String path = Paths.get(".").toAbsolutePath().normalize().toString();
  /**
   * Fenetre.
   */
  private JFrame window = new JFrame();
  /**
   * Tableau.
   */
  private String[] s = {"ElectroniCa", "GéomètrA", "InfOrNium"};
  /**
   * Choix multiple.
   */
  private JComboBox nomArena = new JComboBox(s);
  /**
   * Bouton.
   */
  private JButton enterButton = new JButton();
  /**
   * Bouton.
   */
  private JButton backButton = new JButton();

  /**
   * Police.
   */
  private Font customFont = new Font("Bold", Font.BOLD, 30);
  /**
   * Police.
   */
  private Font comboFont = new Font("Italic", Font.ITALIC, 25);
  /**
   * Musique.
   */
  private File sound =
      new File(
          path + "/src/main/resources/ArenaSelect.wav");
  /* Bien entrer le bon chemin d'acces du son */
  /**
   * the class to handle the audio input.
   */
  private AudioInputStream ais;
  /**
   * the class to hadle a clip.
   */
  private Clip clip;
  /**
   * This is the class that generates the window for the arena.
   * @throws LineUnavailableException throws an exception for a line
   */
  Arena() throws LineUnavailableException {
    try {

      this.clip = AudioSystem.getClip();
      this.ais = AudioSystem.getAudioInputStream(sound);

      this.setBackground(Color.BLACK);
      window.add(this);
      nomArena.setFont(comboFont);
      nomArena.setForeground(Color.DARK_GRAY);
      window.add(nomArena, BorderLayout.PAGE_START);
      backButton.setFont(customFont);
      backButton.setText("Retour");
      backButton.setForeground(Color.WHITE);
      backButton.setBackground(Color.BLACK);
      backButton.addKeyListener(this);
      backButton.addActionListener(this);
      window.add(backButton, BorderLayout.PAGE_END);
      enterButton.setIcon(new ImageIcon(path
              + "/src/main/resources/arena.jpg"));
      /* Bien entrer le bon chemin d'acces de l'image */
      enterButton.addKeyListener(this);
      enterButton.addActionListener(this);
      window.add(enterButton, BorderLayout.CENTER);
      window.setUndecorated(true);
      window.getContentPane();
      window.setSize(750, 700);
      window.setVisible(true);

    } catch (UnsupportedAudioFileException ex) {
      Logger.getLogger(Arena.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(Arena.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {

      clip.open(ais);
      clip.start();

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  @Override
  public final void actionPerformed(final ActionEvent  ae) {
    if (ae.getSource() == getBackButton()) {

            getWindow().dispose();

            this.getClip().close();

      try {
        new Menu();
      } catch (Exception e) {
        e.printStackTrace();
      }

    } else if (ae.getSource() == getEnterButton()) {
      // JOptionPane.showMessageDialog(null,"En construction");
      Arene arene = new Arene();
      arene.buildFight(new AskString(System.in, System.out));
    }
  }

  @Override
  public final void keyTyped(final KeyEvent e) {
    throw new UnsupportedOperationException("Not supported yet.");
    //generated methods, choose Tools | Templates.
  }

  @Override
  public final void keyPressed(final KeyEvent kp) {
   // if (kp.getKeyCode() == KeyEvent.VK_ESCAPE) {
   //         getWindow().dispose();

   //   try {
   //      new Menu();
   //   } catch (IOException e) {
   //     e.printStackTrace();
   //   } catch (UnsupportedAudioFileException ex) {
   //   Logger.getLogger(Arena.class.getName()).log(Level.SEVERE, null, ex);
   //     } catch (LineUnavailableException ex) {
   //  Logger.getLogger(Arena.class.getName()).log(Level.SEVERE, null, ex);
   //     }
   // }
  }

  @Override
  public final void keyReleased(final KeyEvent e) {
    throw new UnsupportedOperationException("Not supported yet.");
// To change body of generated methods, choose Tools | Templates.
  }
  /**
   * Path getter.
   * @return the path of the file to open
   */
  public final String getPath() {
      return this.path;
  }
  /**
   * path setter.
   * @param pathParam path to be set
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
   * @param windowParam the window to be set
   */
  public final void setWindow(final JFrame windowParam) {
      this.window = windowParam;
  }
  /**
   * s getter.
   * @return the s
   */
  public final String[] getS() {
      return s;
  }
  /**
   * s setter.
   * @param sParam the s to set
   */
  public final void setS(final String[] sParam) {
      this.s = sParam;
  }
  /**
   * nomArena getter.
   * @return the nomArena
   */
  public final JComboBox getNomArena() {
      return nomArena;
  }
  /**
   * nomArena setter.
   * @param nomArenaParam the nomArena to set
   */
  public final void setNomArena(final JComboBox nomArenaParam) {
      this.nomArena = nomArenaParam;
  }
  /**
   * enterButton getter.
   * @return the enterButton
   */
  public final JButton getEnterButton() {
      return enterButton;
  }
  /**
   * enterButon setter.
   * @param enterButtonParam the enterButton to set
   */
  public final void setEnterButton(final JButton enterButtonParam) {
      this.enterButton = enterButtonParam;
  }
  /**
   * backButton getter.
   * @return the backButton
   */
  public final JButton getBackButton() {
      return backButton;
  }
  /**
   * backButyon setter.
   * @param backButtonParam the backButton to set
   */
  public final void setBackButton(final JButton backButtonParam) {
      this.backButton = backButtonParam;
  }
  /**
   * customFont getter.
   * @return the customFont
   */
  public final Font getCustomFont() {
      return customFont;
  }
  /**
   * customFOnt setter.
   * @param customFontParam the customFont to set
   */
  public final void setCustomFont(final Font customFontParam) {
      this.customFont = customFontParam;
  }
  /**
   * comboFont getter.
   * @return the comboFont
   */
  public final Font getComboFont() {
      return comboFont;
  }
  /**
   * comboFont setter.
   * @param comboFontParam the comboFont to set
   */
  public final void setComboFont(final Font comboFontParam) {
      this.comboFont = comboFontParam;
  }
  /**
   * SOund getter.
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
   * @return the clip
   */
  public final Clip getClip() {
      return clip;
  }
  /**
   * clip setter.
   * @param clipParam the clip to set
   */
  public final void setClip(final Clip clipParam) {
      this.clip = clipParam;
  }
}
