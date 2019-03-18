/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.six.partOne;

import javax.swing.SwingUtilities;

/**
 *
 * @author ITRO
 */
public class Executor {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SampleGUI();
            }
        });
    }
}
