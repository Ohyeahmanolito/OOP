/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzes.three.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import quizzes.three.listeners.MyButtonAction;

/**
 *
 * @author ITRO
 */
public class UserInput {

    public UserInput() {

        JPanel masterPanel = new JPanel(new BorderLayout(1, 5));
        JPanel topPanel = new JPanel();
        JPanel midPanel = new JPanel();
        JPanel botPanel = new JPanel();

        JTextField textFieldOne = new JTextField();
        topPanel.setLayout(new GridLayout(1, 2));
        topPanel.add(new JLabel("Input text: "));
        topPanel.add(textFieldOne);

        JTextField textFieldTwo = new JTextField();
        botPanel.setLayout(new GridLayout(1, 2));
        botPanel.add(new JLabel("Just output: "));
        textFieldTwo.setEditable(false);
        botPanel.add(textFieldTwo);

        JButton buttonOne = new JButton("Press 1");
        buttonOne.setName("1");
        buttonOne.addActionListener(new MyButtonAction(textFieldOne, textFieldTwo));
        JButton buttonTwo = new JButton("Press 2");
        buttonTwo.setName("2");
        buttonTwo.addActionListener(new MyButtonAction(textFieldOne, textFieldTwo));
        JButton buttonThree = new JButton("Press 3");
        buttonThree.setName("3");
        buttonThree.addActionListener(new MyButtonAction(textFieldOne, textFieldTwo));

        midPanel.setLayout(new GridLayout());
        midPanel.add(buttonOne);
        midPanel.add(buttonTwo);
        midPanel.add(buttonThree);

        masterPanel.add(topPanel, BorderLayout.NORTH);
        masterPanel.add(midPanel, BorderLayout.CENTER);
        masterPanel.add(botPanel, BorderLayout.SOUTH);

        JFrame frame = new JFrame();
        frame.getContentPane().add(masterPanel);
        frame.setTitle("Dada");
        frame.pack();
        frame.setSize(300, 200);
        //TO-DO: set the frame to the middle of the screen
        frame.setVisible(true);
    }
}
