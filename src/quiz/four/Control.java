/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.four;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author ITRO
 */
public class Control implements ActionListener {

    private final Model model;
    private final View view;

    public Control(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String eventName = e.getActionCommand();
        if (eventName.equalsIgnoreCase("Add")) {
            String score = model.add(view.getLabelText());
            view.updateLabelText(score);
        } else {
            String score = model.sub(view.getLabelText());
            view.updateLabelText(score);
        }
    }
}
