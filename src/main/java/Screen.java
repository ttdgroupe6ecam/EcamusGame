/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** @author UserAdmin */
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
import java.nio.file.Paths;
/**
 * this class is the window for introductiion.
 * @author venon arthur
 */
public class Screen extends JPanel {
  /**
   * the path of the current directory.
   */
  private String path = Paths.get(".").toAbsolutePath().normalize().toString();
  /**
   * the Jframe of this class.
   */
  private JFrame window = new JFrame();
  /**
   * a label used of this JFframe.
   */
  private JLabel back = new JLabel();
  /**
   * the method that makes the window.
   */
  Screen() {
    window.add(this);

    window.setLocation(5, 50);
    back.setIcon(new ImageIcon(
            getPath() + "/src/main/resources/Ecamus.png"));
    /* Bien entrer le bon chemin d'acces de l'image */
    window.getContentPane().add(back);
    window.setUndecorated(true);
    window.setSize(970, 850);
    window.setVisible(true);

    try {
      File sound = new File( getPath()
                            + "/src/main/resources/Title_Screen.wav");
      /* Bien entrer le bon chemin d'acces du son */
      AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
      Clip clip1 = AudioSystem.getClip();
      clip1.open(ais);
      clip1.start();

      Thread.sleep(2000);
      clip1.stop();
      window.dispose();
      new Menu();

    } catch (Exception e) {
      System.out.println(e);
    }
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
   * back getter.
   * @return the back
   */
  public final JLabel getBack() {
      return back;
  }
  /**
   * back setter.
   * @param backParam the back to set
   */
  public final void setBack(final JLabel backParam) {
      this.back = backParam;
  }
}
