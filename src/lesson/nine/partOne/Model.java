/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.nine.partOne;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ITRO
 */
public class Model {

    public String eventOne(String value) {
        return "USER INPUT " + value;
    }

    public String eventTwo(String value) {
        return "User Input " + value;
    }

    public String eventThree(String value) {
        return "character count: " + value.length();
    }

    public String clear() {
        return "";
    }
}
