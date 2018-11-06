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
<<<<<<< HEAD
                back.setIcon(new ImageIcon ("D:\\4MA\\TDD Projet\\ECAMUS\\Ecam_Arena\\Image\\Ecamus.png"));/* Bien entrer le bon chemin d'acces de l'image */
=======
                back.setIcon(new ImageIcon ("C:\\Users\\Fatine\\Desktop\\Ecam_Arena\\Ecam_Arena\\EcamusGame\\Image\\Ecamus.png"));/* Bien entrer le bon chemin d'acces de l'image */
>>>>>>> 053ac23ddbbd56a3c5023adb4bbd05d8f41921d9
                window.getContentPane().add(back);
                window.setUndecorated(true);
                window.setSize(970, 850);
                window.setVisible(true);
                
                try {
<<<<<<< HEAD
                        File sound = new File("D:\\4MA\\TDD Projet\\ECAMUS\\Ecam_Arena\\musique\\Title Screen.wav");/* Bien entrer le bon chemin d'acces du son */
=======
                        File sound = new File("C:\\Users\\Fatine\\Desktop\\Ecam_Arena\\Ecam_Arena\\EcamusGame\\Musique\\Title Screen.wav");/* Bien entrer le bon chemin d'acces du son */
>>>>>>> 053ac23ddbbd56a3c5023adb4bbd05d8f41921d9
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