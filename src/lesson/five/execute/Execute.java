/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.five.execute;

import javax.swing.SwingUtilities;
import lesson.five.view.MyViewThree;

/**
 *
 * @author mvoctavianojr
 */
public class Execute {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new MyViewThree();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}


