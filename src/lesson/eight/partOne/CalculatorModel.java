package lesson.eight.partOne;

/**
 * This is the model of this MVC implementation of a calculator. It performs the
 * functions of the calculator and keeps track of what the user has entered.
 *
 * @author Tom Bylander
 */
public class CalculatorModel {

    private double displayValue;
    private double internalValue;
    private String displayString;
    private String operation;
    private boolean start;
    private boolean dot;

    public CalculatorModel() {
        displayValue = 0.0;
        displayString = "" + displayValue;
        internalValue = 0;
        dot = false;
        start = true;
        operation = "";
    }

    public String getValue() {
        return displayString;
    }

    public void update(String text) {
        if (start) {
            internalValue = displayValue;
            displayValue = 0;
            displayString = "";
            start = false;
            dot = false;
        }
        
        if (text.length() == 1 && "0123456789".indexOf(text) >= 0) {
            displayString += text;
            displayValue = Double.valueOf(displayString);
        } else if (text.equals(".")) {
            if (!dot) {
                dot = true;
                if (displayString.equals("")) {
                    displayString = "0";
                }
                displayString += ".";
            }
        } else {
            if (operation.equals("+")) {
                displayValue = internalValue + displayValue;
            } else if (operation.equals("-")) {
                displayValue = internalValue - displayValue;
            } else if (operation.equals("*")) {
                displayValue = internalValue * displayValue;
            } else if (operation.equals("/")) {
                displayValue = internalValue / displayValue;
            }
            displayString = "" + displayValue;
            internalValue = displayValue;
            operation = text;
            start = true;
        }
    }
}
