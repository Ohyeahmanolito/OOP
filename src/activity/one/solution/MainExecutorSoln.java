/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.one.solution;

import activity.one.*;

/**
 *
 * @author mvoctavianojr
 */
public class MainExecutorSoln {

    /**
     * This is where you will execute the different methods of ExerciseOneSoln.java.
     */
    public static void main(String[] args) {
        ExerciseOneSoln x = new ExerciseOneSoln();

        String x1 = "C:\\Users\\ITRO\\Documents\\NetBeansProjects\\OOP\\src\\test\\files\\TestOne.txt";
        String x2 = "C:\\Users\\ITRO\\Documents\\NetBeansProjects\\OOP\\src\\test\\files\\TestTwo.txt";

        System.out.println(x.getTotalOfTwoFiles(x1, x2));

        String x3 = "C:\\Users\\ITRO\\Documents\\NetBeansProjects\\OOP\\src\\test\\files\\TestThree.txt";
        System.out.println(x.totalUnique(x3));
    }
}
