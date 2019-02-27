/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.five.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import lesson.five.view.customGUI.CustomTextField;

/**
 *
 * @author mvoctavianojr
 */
public class MyViewThree {

    public MyViewThree() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));

        JTextField customText = new CustomTextField();
        panel.add(customText);
        panel.add(new CustomTextField());

        JFrame frame = new JFrame("Swing MVC Demo");
        frame.add(panel);
        frame.setBackground(Color.BLUE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);

    }

}
