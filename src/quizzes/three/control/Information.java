/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzes.three.control;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ITRO
 */
public class Information {

    private final JTextField x;
    private final JTextField y;

    public Information(JTextField x, JTextField y) {
        this.x = x;
        this.y = y;

    }

    public void eventOne() {
        JOptionPane.showMessageDialog(null, x.getText(), "USER INPUT", 1);
        x.setText("");
        y.setText("");

    }

    public void eventTwo() {
        y.setText(x.getText());
        x.setText("");
    }

    public void eventThree() {
        int count = x.getText().length();
        JOptionPane.showMessageDialog(null, "character count: " + count, "CHAR COUNT", 1);
        y.setText("character count: " + count);
        x.setText("");
    }
}
