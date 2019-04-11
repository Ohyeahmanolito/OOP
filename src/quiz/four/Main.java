/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.four;

import javax.swing.SwingUtilities;

/**
 *
 * @author ITRO
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Model model = new Model();
                View view = new View();
                Control control = new Control(model, view);

                view.addListener(control);
                view.launch();
            }
        });
    }
}
