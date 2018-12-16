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
   * path.
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
          path + "/resources/Arena_Select.wav");
  /* Bien entrer le bon chemin d'acces du son */
  private AudioInputStream ais;
  /**
  * Clip.
  */
  private Clip clip;

   /**
   * Default constract.
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
      enterButton.setIcon(new ImageIcon(
              getPath() + "/resources/arena.jpg"));
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
        Menu m = new Menu();
      } catch (UnsupportedAudioFileException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }

    } else if (ae.getSource() == getEnterButton()) {
      // JOptionPane.showMessageDialog(null,"En construction");
      Arene.BuildFight();
    }
  }

  @Override
  public final void keyTyped(final KeyEvent e) {
    throw new UnsupportedOperationException(
        "Not supported yet."); // To change body of
    //generated methods, choose Tools | Templates.
  }

  @Override
  public final void keyPressed(final KeyEvent kp) {
    if (kp.getKeyCode() == KeyEvent.VK_ESCAPE) {
            getWindow().dispose();

      try {
        Menu m = new Menu();
      } catch (UnsupportedAudioFileException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public final void keyReleased(final KeyEvent e) {
    throw new UnsupportedOperationException(
        "Not supported yet."); 
// To change body of generated methods, choose Tools | Templates.
  }
  
  public String getPath() {
      return this.path;
  }
  
  public void setPath(String path) {
      this.path=path;
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
     * @return the s
     */
    public String[] getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(String[] s) {
        this.s = s;
    }

    /**
     * @return the nomArena
     */
    public JComboBox getNomArena() {
        return nomArena;
    }

    /**
     * @param nomArena the nomArena to set
     */
    public void setNomArena(JComboBox nomArena) {
        this.nomArena = nomArena;
    }

    /**
     * @return the enterButton
     */
    public JButton getEnterButton() {
        return enterButton;
    }

    /**
     * @param enterButton the enterButton to set
     */
    public void setEnterButton(JButton enterButton) {
        this.enterButton = enterButton;
    }

    /**
     * @return the backButton
     */
    public JButton getBackButton() {
        return backButton;
    }

    /**
     * @param backButton the backButton to set
     */
    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    /**
     * @return the customFont
     */
    public Font getCustomFont() {
        return customFont;
    }

    /**
     * @param customFont the customFont to set
     */
    public void setCustomFont(Font customFont) {
        this.customFont = customFont;
    }

    /**
     * @return the comboFont
     */
    public Font getComboFont() {
        return comboFont;
    }

    /**
     * @param comboFont the comboFont to set
     */
    public void setComboFont(Font comboFont) {
        this.comboFont = comboFont;
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
     * @return the clip
     */
    public Clip getClip() {
        return clip;
    }

    /**
     * @param clip the clip to set
     */
    public void setClip(Clip clip) {
        this.clip = clip;
    }
}
