/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.four;

/**
 *
 * @author ITRO
 */
public class Model {

    public String add(String text) {
        return "" + (Integer.parseInt(text) + 1);
    }

    public String sub(String text) {
        return "" + (Integer.parseInt(text) - 1);
    }
}
