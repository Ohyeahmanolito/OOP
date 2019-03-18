/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzes.three.control;

import javax.swing.SwingUtilities;
import quizzes.three.view.UserInput;

/**
 *
 * @author ITRO
 */
public class Execute {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                    new UserInput();
            }
        });
    }
    
}
