
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
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
import javax.swing.JPanel;
import javax.swing.JComboBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UserAdmin
 */
public class Arena extends JPanel implements ActionListener,KeyListener {
    JFrame window = new JFrame();
    String[] s = {"ElectroniCa","GéomètrA","InfOrNium","ConstructA","AutomaDium"};
    JComboBox nomArena = new JComboBox(s);
    JButton enterButton = new JButton();
    JButton backButton = new JButton();
    
    Font customFont = new Font("Bold",Font.BOLD,30);
    Font comboFont = new Font("Italic",Font.ITALIC,25);
    
    File sound = new File("C:\\Users\\UserAdmin\\Documents\\NetBeansProjects\\Ecam_Arena\\musique\\Arena Select.wav"); /* Bien entrer le bon chemin d'acces du son */
    AudioInputStream ais;
    Clip clip;
    
    Arena() throws LineUnavailableException
    {
        try{
                
            this.clip = AudioSystem.getClip();
            this.ais = AudioSystem.getAudioInputStream(sound);
            
          
            this.setBackground(Color.BLACK);
            window.add(this);
            nomArena.setFont(comboFont);
            nomArena.setForeground(Color.DARK_GRAY);
            window.add(nomArena,BorderLayout.PAGE_START);
            backButton.setFont(customFont);
            backButton.setText("Retour");
            backButton.setForeground(Color.WHITE);
            backButton.setBackground(Color.BLACK);
            backButton.addKeyListener(this);
            backButton.addActionListener(this);
            window.add(backButton,BorderLayout.PAGE_END);
            enterButton.setIcon(new ImageIcon("C:\\Users\\UserAdmin\\Documents\\NetBeansProjects\\Ecam_Arena\\Image\\arena.jpg")); /* Bien entrer le bon chemin d'acces de l'image */
            enterButton.addKeyListener(this);
            enterButton.addActionListener(this);
            window.add(enterButton,BorderLayout.CENTER);
            window.setUndecorated(true);
            window.getContentPane();
            window.setSize(750, 900);
            window.setVisible(true);
            
                
            }catch(UnsupportedAudioFileException ex){Logger.getLogger(Arena.class.getName()).log(Level.SEVERE, null,ex);} catch (IOException ex) {
            Logger.getLogger(Arena.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
                        
                        clip.open(ais);
                        clip.start();
                        
                        
                        
                        
                    }catch(Exception e){System.out.println(e);}
        
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==backButton)
        {
            
            window.dispose();
            this.clip.close();
           
            try {
                Menu m = new Menu();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(Arena.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Arena.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else if(ae.getSource()==enterButton)
        {
            
            
            window.dispose();
            this.clip.close();
            try {
                Player p = new Player ();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(Arena.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Arena.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Arena.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent kp) {
        if (kp.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            window.dispose();
            
            try {
            
                Menu m = new Menu();
            
            
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(Arena.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Arena.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
