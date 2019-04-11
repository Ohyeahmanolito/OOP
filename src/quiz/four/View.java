/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.four;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ITRO
 */
public class View {

    private JFrame frame;
    private JLabel label;
    private JButton buttonAdd;
    private JButton buttonSub;

    View() {
        frame = new JFrame("View");
        JPanel masterPanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(new GridLayout());

        label = new JLabel("0", JLabel.CENTER);
        buttonAdd = new JButton("Add");
        buttonSub = new JButton("Subract");
        buttonPanel.add(buttonAdd);
        buttonPanel.add(buttonSub);

        masterPanel.add(label, BorderLayout.NORTH);
        masterPanel.add(buttonPanel, BorderLayout.SOUTH);
        frame.add(masterPanel);

    }

    public void launch() {
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    public void addListener(Control control) {
        buttonAdd.addActionListener(control);
        buttonSub.addActionListener(control);
    }

    public void updateLabelText(String text) {
        label.setText(text);
    }

    public String getLabelText() {
        return label.getText();
    }

}
