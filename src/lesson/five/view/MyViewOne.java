/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.five.view;

import javax.swing.JFrame;

/**
 *
 * @author mvoctavianojr
 */
public class MyViewOne {

    public MyViewOne() {
        JFrame frame = new JFrame("Swing MVC Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
