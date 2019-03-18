/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzes.three.listeners;

import quizzes.three.control.Information;
import static java.awt.SystemColor.control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author ITRO
 */
public class MyButtonAction implements ActionListener {

    private Information info;

    public MyButtonAction(JTextField x, JTextField y) {
        info = new Information(x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String eventName = ((JButton) e.getSource()).getName();

        if (eventName.equalsIgnoreCase("1")) {
            info.eventOne();
        } else if (eventName.equalsIgnoreCase("2")) {
            info.eventTwo();
        } else {
            info.eventThree();
        }

    }

}
