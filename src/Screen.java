/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UserAdmin
 */
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

public class Screen extends JPanel {
    
    JFrame window = new JFrame();
    JLabel back = new JLabel();
    Screen()
            { 
                window.add(this);
          
    
                window.setLocation(5, 50);
                back.setIcon(new ImageIcon ("D:\\4MA\\TDD Projet\\ECAMUS\\Ecam_Arena\\Image\\Ecamus.png"));/* Bien entrer le bon chemin d'acces de l'image */
                window.getContentPane().add(back);
                window.setUndecorated(true);
                window.setSize(970, 850);
                window.setVisible(true);
                
                try {
                        File sound = new File("D:\\4MA\\TDD Projet\\ECAMUS\\Ecam_Arena\\Musique\\Title Screen.wav");/* Bien entrer le bon chemin d'acces du son */
                        AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
                        Clip clip1 = AudioSystem.getClip();
                        clip1.open(ais);
                        clip1.start();
                        
                        Thread.sleep(2000);
                        clip1.stop();
                        window.dispose();
                        Menu m = new Menu();
                        
                        }catch(Exception e){System.out.println(e);}
}
    
}