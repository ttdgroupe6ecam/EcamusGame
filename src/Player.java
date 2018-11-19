
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UserAdmin
 */
public class Player extends JPanel implements ActionListener,KeyListener {
    JFrame window = new JFrame();
    JButton playerInfotmaticien = new JButton();
    JButton playerElectronicien = new JButton();
    JButton returnButton = new JButton();
    JLabel background = new JLabel();
    JLabel informaticienLabel = new JLabel();
    File sound = new File("C:\\Users\\UserAdmin\\Documents\\NetBeansProjects\\Ecam_Arena\\musique\\Player Select.wav"); /* Bien entrer le bon chemin d'acces du son */
    AudioInputStream ais;
    Clip clip1;
    
    Player() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        
        
            
                    this.ais = AudioSystem.getAudioInputStream(sound);
                    this.clip1 = AudioSystem.getClip();
          try {
                        
                        clip1.open(ais);
                        
                        
                       
                        clip1.setMicrosecondPosition(20000000);
                        clip1.start();
                        
                        
                        
                        
                    }catch(Exception e){System.out.println(e);}
      
         window.add(this);
     
        returnButton.setIcon(new ImageIcon("C:\\Users\\UserAdmin\\Documents\\NetBeansProjects\\Ecam_Arena\\Image\\Return_Button.png"));
        returnButton.setBackground(Color.BLACK);
        returnButton.addKeyListener(this);
        returnButton.addActionListener(this);
        window.add(returnButton,BorderLayout.PAGE_END);
 
        
        /*###### Création des boutons joueurs 1 et 2  Informaticien/Electronicien ##### */
       
        playerInfotmaticien.setBackground(Color.BLACK);
        playerInfotmaticien.setIcon(new ImageIcon("C:\\Users\\UserAdmin\\Documents\\NetBeansProjects\\Ecam_Arena\\Image\\Informaticien.jpg"));
        playerInfotmaticien.addKeyListener(this);
        playerInfotmaticien.addActionListener(this);
        window.add(playerInfotmaticien,BorderLayout.LINE_END);
        
      
        playerElectronicien.setBackground(Color.BLACK);
        playerElectronicien.setIcon(new ImageIcon("C:\\Users\\UserAdmin\\Documents\\NetBeansProjects\\Ecam_Arena\\Image\\Electronicien.jpg"));
        playerElectronicien.addKeyListener(this);
        playerElectronicien.addActionListener(this);
        window.add(playerElectronicien,BorderLayout.LINE_START);
        
        
        
        
        /*###### Création de l'arrière plan commentaire  #####  */ 
        
        background.setIcon(new ImageIcon("C:\\Users\\UserAdmin\\Documents\\NetBeansProjects\\Ecam_Arena\\Image\\Choix_Player.jpg"));
        window.add(background,BorderLayout.CENTER);
       
      
               
        
        window.getContentPane().setBackground(Color.BLACK);
        window.setUndecorated(true);
        window.setSize(2000, 1000);
        window.setVisible(true);
        
        
    }

    @Override
    /* public void actionPerformed(ActionEvent ae) 
      Permet de ratacher les actions de la souris au boutton créés */
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()==returnButton)
        {
            window.dispose();
             try {
                 clip1.close();
                 Menu m = new Menu();
             } catch (UnsupportedAudioFileException ex) {
                 Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if(ae.getSource()==playerInfotmaticien) /* Si playerInfotmaticien, choix des armes se lance  */
        { 
            
            
            clip1.close();
            window.dispose();
            Weapon_choice c = new Weapon_choice();
        }
        else if(ae.getSource()==playerElectronicien) /* Si playerInfotmaticien, Choix des armes se lance   */
        {   
            clip1.close();
            window.dispose();
            Weapon_choice c = new Weapon_choice();
        
        
    }
    }

    @Override
     public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent kp) {
         if(kp.getKeyCode()==KeyEvent.VK_ESCAPE)
        { 
            window.dispose();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
