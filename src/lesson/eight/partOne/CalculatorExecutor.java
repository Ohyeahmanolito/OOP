package lesson.eight.partOne;

import javax.swing.JFrame;

/**
 * The CalculatorExecutor class along with CalculatorController, CalculatorModel
 * and CalculatorView implements a simple-minded calculator. The implementation
 * is based on the MVC design pattern.
 *
 * @author Tom Bylander
 */
public class CalculatorExecutor {

    /**
     * Create the model, view and controller objects, and launch the
     * application.
     */
    public static void main(String[] args) {

        /* create new model, view and controller */
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        /* register controller as listener */
        view.registerListener(controller);
        view.launch();
    }
}
