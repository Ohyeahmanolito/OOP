package lesson.eight.partOne;

import java.awt.*;
import javax.swing.*;

/**
 * This is the view part of my MVC implementation of a calculator. It creates
 * the panels and the components of the window. The current value is displayed
 * in a JLabel.
 *
 * @author Tom Bylander
 */
public class CalculatorView {

    private JFrame frame;
    private JLabel display;
    private JPanel buttonsPanel;
    private JMenu exampleMenu;
    private int digits;

    public CalculatorView() {
        frame = new JFrame("Simple Calculator");

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        exampleMenu = new JMenu("Menu");
        menuBar.add(exampleMenu);

        JMenuItem twoDigitsButton = new JMenuItem("Two Decimal Digits");
        exampleMenu.add(twoDigitsButton);

        JMenuItem anyDigitsButton = new JMenuItem("Any Decimal Digits");
        exampleMenu.add(anyDigitsButton);

        JMenuItem exitButton = new JMenuItem("Exit");
        exampleMenu.add(exitButton);

        JPanel displayPanel = new JPanel();
        frame.add(displayPanel, BorderLayout.NORTH);

        display = new JLabel("0.0");
        displayPanel.add(display);
        digits = -1;

        buttonsPanel = new JPanel();
        frame.add(buttonsPanel, BorderLayout.CENTER);
        buttonsPanel.setLayout(new GridLayout(4, 4, 0, 0));

        String[] buttonStrings = {
            "1", "2", "3", "+",
            "4", "5", "6", "-",
            "7", "8", "9", "*",
            "0", ".", "=", "/"
        };

        for (String s : buttonStrings) {
            buttonsPanel.add(new JButton(s));
        }

    }

    /**
     * Register the controller as the listener to the menu items and the
     * buttons.
     *
     * @param controller The event handler for the calculator
     */
    public void registerListener(CalculatorController controller) {

        //Get all components (widgets) in the panel
        Component[] components = buttonsPanel.getComponents();
        for (Component component : components) {
            if (component instanceof AbstractButton) {
                // Force cast to get the Abstractbutton (properties of button) 
                // since we all know that all components are button.
                AbstractButton button = (AbstractButton) component;
                button.addActionListener(controller);
            }
        }

        components = exampleMenu.getMenuComponents();
        for (Component component : components) {
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.addActionListener(controller);
            }
        }
    }

    /**
     * Display the value in the JLabel of the calculator. Round off the number
     * of digits if needed.
     *
     * @param value the value to be displayed
     */
    public void update(String value) {
        if (digits < 0) {
            display.setText(value);
        } else {
            String format = "%." + digits + "f";
            String text = String.format(format, Double.valueOf(value));
            display.setText(text);
        }
    }

    public void setDigits(int digits) {
        this.digits = digits;
    }

    public void launch() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
