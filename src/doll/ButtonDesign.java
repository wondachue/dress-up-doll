/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doll;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Megan
 */
public class ButtonDesign extends JButton{
    ImageIcon img = new ImageIcon();
   ButtonDesign(int pic, int change){
       //gets the button icon pictures
       if(pic == 0)
       {
           if(change == -1)
           {
            img = new ImageIcon(getClass().getResource("sun.png"));
           }
           else
           {
            img = new ImageIcon(getClass().getResource("moon.png"));
           }
       }
       if(pic == 1)
       {
           img = new ImageIcon(getClass().getResource("one.png"));
       }
       if(pic == 2)
       {
           img = new ImageIcon(getClass().getResource("two.png"));
       }
       this.setIcon(img);
   } 
}
