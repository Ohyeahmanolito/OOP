/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.nine.partOne;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author ITRO
 */
public class Control implements ActionListener {

    private Model model;
    private View view;

    /**
     * This saves the model and and view.
     *
     * @param model a CalculatorModel for the functions of the calculator and
     * the values entered by the user
     * @param view a CalculatorView for what should be displayed in the GUI
     */
    public Control(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String eventName = ((JButton) e.getSource()).getName();
        String text = "";
        if (eventName.equalsIgnoreCase("1")) {
            text = model.eventOne(view.getTextFieldOne());
            view.popOptionPane(text, "EVENT 1");
            view.setTextFieldOne(model.clear());
            view.setTextFieldTwo(model.clear());
        } else if (eventName.equalsIgnoreCase("2")) {
            text = model.eventTwo(view.getTextFieldOne());
            view.setTextFieldOne(model.clear());
            view.setTextFieldTwo(text);
        } else {
            System.out.println("three");
            text = model.eventThree(view.getTextFieldOne());
            view.popOptionPane(text, "EVENT 3");
            view.setTextFieldOne(model.clear());
            view.setTextFieldTwo(text);
        }
    }
}
