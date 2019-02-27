/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.five.view.customGUI;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author mvoctavianojr
 */
public class CustomTextField extends JTextField {

    private Color myBackground = Color.RED;

    @Override
    public void setBackground(Color bg) {
        super.setBackground(myBackground);
    }

}
