/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UserAdmin
 */
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Screen extends JPanel {
    
    JFrame window = new JFrame();
    JLabel back = new JLabel();
    Screen()
            { 
                window.add(this);
          
    
                window.setLocation(50, 5);
                back.setIcon(new ImageIcon ("C:\\Users\\Fatine\\Desktop\\EcamusGame\\EcamusGame\\Image\\Ecamus.png"));/* Bien entrer le bon chemin d'acces de l'image */
                window.getContentPane().add(back);
                window.setUndecorated(true);
                window.setSize(950, 850);
                window.setVisible(true);
                
                try {
                        File sound = new File("C:\\Users\\Fatine\\Desktop\\EcamusGame\\EcamusGame\\Musique\\Title Screen.wav");/* Bien entrer le bon chemin d'acces du son */
                        AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
                        Clip clip1 = AudioSystem.getClip();
                        clip1.open(ais);
                        clip1.start();
                        
                        Thread.sleep(20000);
                        clip1.stop();
                        window.dispose();
                        Menu m = new Menu();
                        
                        }catch(Exception e){System.out.println(e);}
}
    
}