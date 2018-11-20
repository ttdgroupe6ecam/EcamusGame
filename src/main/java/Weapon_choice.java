
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
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
public class Weapon_choice extends JPanel implements ActionListener,KeyListener  {
    JFrame window = new JFrame();
    JPanel container = new JPanel();
    JButton returnButton = new JButton();
    JButton arme_1 = new JButton();
    JButton arme_2 = new JButton("Arme_Informaticien");
    JButton arme_3 = new JButton("Arme_Informaticien");
    JButton arme_4 = new JButton("Arme_Informaticien");
    JButton arme_5 = new JButton("Arme_Informaticien");
    JButton arme_6 = new JButton("Arme_Informaticien");
    GridLayout g = new GridLayout(2,1);
    Clip clip;
    
    Weapon_choice(){
        
        
        
                    
        window.setTitle("Choix de L'arme");
        
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        arme_1.setIcon(new ImageIcon("C:\\Users\\Fatine\\Desktop\\EcamusGame\\EcamusGame\\Image\\clé_molette.jpg"));
        arme_1.addKeyListener(this);
        arme_1.addActionListener(this);
        
        
        arme_2.setIcon( new ImageIcon(""));
        arme_2.addKeyListener(this);
        arme_2.addActionListener(this);
        window.add(arme_1);
        
       
        
        arme_3.setIcon( new ImageIcon(""));
        arme_3.addKeyListener(this);
        arme_3.addActionListener(this);
        window.add(arme_1);
        
        arme_4.setIcon( new ImageIcon(""));
        arme_4.addKeyListener(this);
        arme_4.addActionListener(this);
        window.add(arme_1);
        
        arme_5.setIcon( new ImageIcon(""));
        arme_5.addKeyListener(this);
        arme_5.addActionListener(this);
        window.add(arme_1);
        
        arme_6.setIcon( new ImageIcon(""));
        arme_6.addKeyListener(this);
        arme_6.addActionListener(this);
        window.add(arme_1);
        
        returnButton.setIcon(new ImageIcon("C:\\Users\\Fatine\\Desktop\\EcamusGame\\EcamusGame\\Image\\Return_Button.png"));
        returnButton.setBackground(Color.BLACK);
        returnButton.addKeyListener(this);
        returnButton.addActionListener(this);
        window.add(returnButton);
                

        window.setLayout(g);
        window.add(arme_1);
        window.add(arme_2);
        window.add(arme_3);
        window.add(arme_4);
        window.add(arme_5);
        window.add(arme_6);
       
        window.setVisible(true);
        
        
        
        
    }
    

    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()==returnButton)
        {
            
            window.dispose();
             try {
                 
                 Player p = new Player();
             } catch (UnsupportedAudioFileException | IOException ex) {
                 Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
             } catch (LineUnavailableException ex) {
                 Logger.getLogger(Weapon_choice.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         else if(ae.getSource() == arme_1){
             try {
                 window.dispose();
                Arene.ChooseWarior(1);
                Arene.ChooseWeapon(2);
                Arene.BuildFight();
                
                
             } catch (UnsupportedAudioFileException ex) {
                 Logger.getLogger(Weapon_choice.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(Weapon_choice.class.getName()).log(Level.SEVERE, null, ex);
             }
             
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
