/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.one.solution;

import activity.one.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

/**
 *
 * @author mvoctavianojr
 */
public class ExerciseOneSoln {

    /**
     * TO-DO code here the logic that sum all characters from TestOne.txt and
     * TestTwo.txt.
     *
     * NOTE: Use the add() of HelperClass to add characters.
     *
     * @param filePathOne Path of Test.txt.
     * @param filePathTwo Path of TestTwo.txt.
     *
     *
     * @return total character counts from the two files.
     */
    public int getTotalOfTwoFiles(String filePathOne, String filePathTwo) {
        int var1 = 0;
        int var2 = 0;
        try {
            BufferedReader read = new BufferedReader(new FileReader(filePathOne));
            String line = null;
            while ((line = read.readLine()) != null) {
                var1 += line.length();
            }

            read = new BufferedReader(new FileReader(filePathTwo));
            line = null;
            while ((line = read.readLine()) != null) {
                var2 += line.length();
            }
        } catch (Exception e) {
        }
        return HelperClass.add(var1, var2);
    }

    /**
     * TO-DO code here the logic that returns the total number of unique words
     * from TestThree.txt
     *
     * @param filePath the text file that will be read.
     *
     * @return total unique words
     */
    public int totalUnique(String filePath) {
        HashSet<String> setList = new HashSet<>();
        try {
            BufferedReader read = new BufferedReader(new FileReader(filePath));
            String line = null;
            while ((line = read.readLine()) != null) {

                String[] wordArray = line.split(" ");

                for (int index = 0; index < wordArray.length; index++) {
                    setList.add(wordArray[index]);
                }
            }

        } catch (Exception e) {
        }

        return setList.size();
    }

    /**
     * TO-DO code here the logic that checks if the specified element exists in
     * the given array or not.
     *
     * @param list the list of string from user.
     * @param find the element that will be search from the list
     *
     * @return True if the element exists, otherwise false.
     *
     */
    public static boolean isInsideElement(String[] list, String find) {
        return false;
    }

    /**
     * TO-DO code here the logic that displays all the unique words in the list
     * and its corresponding frequency.
     *
     * @param list the list of string from user.
     */
    public void displayUniqueWithFrequency(String[] list) {

    }

    /**
     * TO-DO check the ArrayListProb.pdf for the task.
     */
    public void arrayListProblem() {

    }

    /**
     * TO-DO check the MoreJavaCollections.pdf (Word Swap) for the task.
     */
    public void swapWord() {
    }

    /**
     * TO-DO check the MoreJavaCollections.pdf (Replace strings with Length 4)
     * for the task.
     *
     * NOTE: Use the wordLength() of HelperClass to count the length of string.
     */
    public void replaceString() {
    }

    /**
     * TO-DO check the MoreJavaCollections.pdf (Remove Even Strings) for the
     * task.
     *
     * NOTE: Use the wordLength() of HelperClass to count the length of string.
     */
    public static void removeEvenString() {
    }
}
