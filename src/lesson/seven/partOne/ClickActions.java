/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.seven.partOne;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author ITRO
 */
public class ClickActions implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
       
        JOptionPane.showMessageDialog(null, "ha", "Title", 0);

    }

}
