/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.five.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lesson.five.listeners.MyListener;

/**
 *
 * @author mvoctavianojr
 */
public class MyViewTwo {

    public MyViewTwo() {
        JButton buttonOne = new JButton("Close");
        buttonOne.setBounds(50, 60, 80, 30);
        buttonOne.setToolTipText("Sarap");
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Inside button", "Display only", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JButton buttonTwo = new JButton("Open");
        buttonTwo.setToolTipText("Mas masarap ka");
        buttonTwo.setName("haha");
        buttonTwo.addActionListener(new MyListener());

        JButton buttonThree = new JButton("HELLO");
        buttonTwo.setToolTipText("Mas masarap ka");
        buttonTwo.setName("X");
        buttonTwo.addActionListener(new MyListener());

        JFrame frame = new JFrame("MyViewTwo");
        JPanel panel = new JPanel();

        panel.add(buttonOne);
        panel.add(buttonTwo);
        panel.add(buttonThree);

        frame.getContentPane().add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 200);

        frame.setResizable(false);
        frame.setVisible(true);
    }
}
