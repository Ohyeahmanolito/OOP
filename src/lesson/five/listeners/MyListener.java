/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.five.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author mvoctavianojr
 */
public class MyListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        if (((JButton) e.getSource()).getName().equalsIgnoreCase("haha")) {
            JOptionPane.showMessageDialog(null, "Open", "Open", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Im here");
        } else if ((((JButton) e.getSource()).getName().equalsIgnoreCase("X"))) {
            JOptionPane.showMessageDialog(null, "X", "X", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
