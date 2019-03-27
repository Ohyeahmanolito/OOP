/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.seven.partOne;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author ITRO
 */
public class SampleGui {
    
    public static void main(String[] args) {

        // create a frame
        JFrame frame = new JFrame("Menu demo");

        // create a label
        JLabel l = new JLabel("no task ");

        // create a menubar
        JMenuBar mb = new JMenuBar();

        // create a menu 
        JMenu mainMenu = new JMenu("Menu");
        JMenu subMenu = new JMenu("submenu");

        // create menuitems
        JMenuItem menu1 = new JMenuItem("MenuItem1");
        JMenuItem menu2 = new JMenuItem("MenuItem2");
        JMenuItem menu3 = new JMenuItem("MenuItem3");
        JMenuItem sub1 = new JMenuItem("SubMenuItem1");
        JMenuItem sub2 = new JMenuItem("SubMenuItem2");

        // add ActionListener to menuItems 
        menu1.addActionListener(new ClickActions());
        menu1.setMnemonic(KeyEvent.VK_F);
        
        menu2.addActionListener(new ClickActions());
       
        
        menu3.addActionListener(new ClickActions());
        sub1.addActionListener(new ClickActions());
        sub2.addActionListener(new ClickActions());

        // add menu items to menu 
        mainMenu.add(menu1);
        mainMenu.add(menu2);
        mainMenu.add(menu3);
        subMenu.add(sub1);
        subMenu.add(sub2);

        // add submenu 
        mainMenu.add(subMenu);

        // add menu to menu bar 
        mb.add(mainMenu);

        // add menubar to frame 
        frame.setJMenuBar(mb);

        // add label 
        frame.add(l);

        // set the size of the frame 
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
}
