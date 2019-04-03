/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.nine.partOne;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import quizzes.three.listeners.MyButtonAction;

/**
 *
 * @author ITRO
 */
public class View {

    private final JPanel masterPanel;
    private final JPanel topPanel;

    private final JPanel midPanel;
    private final JPanel botPanel;
    private final JTextField textFieldOne;
    private final JTextField textFieldTwo;
    private final JButton buttonOne;
    private final JButton buttonTwo;
    private final JButton buttonThree;
    private final JFrame frame;

    public View() {

        masterPanel = new JPanel(new BorderLayout(1, 5));
        topPanel = new JPanel();
        midPanel = new JPanel();
        botPanel = new JPanel();

        textFieldOne = new JTextField();
        topPanel.setLayout(new GridLayout(1, 2));
        topPanel.add(new JLabel("Input text: "));
        topPanel.add(textFieldOne);

        textFieldTwo = new JTextField();
        botPanel.setLayout(new GridLayout(1, 2));
        botPanel.add(new JLabel("Just output: "));
        textFieldTwo.setEditable(false);
        botPanel.add(textFieldTwo);

        buttonOne = new JButton("Press 1");
        buttonOne.setName("1");
        buttonTwo = new JButton("Press 2");
        buttonTwo.setName("2");

        buttonThree = new JButton("Press 3");
        buttonThree.setName("3");

        midPanel.setLayout(new GridLayout());
        midPanel.add(buttonOne);
        midPanel.add(buttonTwo);
        midPanel.add(buttonThree);

        masterPanel.add(topPanel, BorderLayout.NORTH);
        masterPanel.add(midPanel, BorderLayout.CENTER);
        masterPanel.add(botPanel, BorderLayout.SOUTH);

        frame = new JFrame();
        frame.getContentPane().add(masterPanel);
    }

    public void registerListener(ActionListener listener) {
        buttonOne.addActionListener(listener);
        buttonTwo.addActionListener(listener);
        buttonThree.addActionListener(listener);
        System.out.println("done setup");
    }

    void launch() {
        frame.setTitle("Dada");
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public void setTextFieldOne(String text) {
        textFieldOne.setText(text);
    }

    public String getTextFieldOne() {
        return textFieldOne.getText();
    }

    public String getTextFieldTwo() {
        return textFieldTwo.getText();
    }

    public void setTextFieldTwo(String text) {
        System.out.println("im here" + text);
        textFieldTwo.setText(text);
    }

    public void popOptionPane(String title, String input) {
        JOptionPane.showMessageDialog(null, title, input, 1);
    }
}
