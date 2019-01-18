/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.one;

/**
 *
 * @author mvoctavianojr
 */
public class HelperClass {

    private HelperClass() {
    }

    /**
     * This method adds the sum of two numbers
     *
     * @param num1 first number
     * @param num2 second number
     */
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * This method gives the length of word.
     *
     * @param word String that characters will be count.
     *
     * return length of the word.
     */
    public static int wordLength(String word) {
        return word.length();
    }
}
