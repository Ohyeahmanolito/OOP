/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.two.partOne;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ITRO
 */
public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> listSample = new ArrayList<>();
        List<String> an = new ArrayList<>();
        ArrayList<String> listSampleTwo = new ArrayList<>();

//        Add elements in the list.
        listSample.add("mano");
        listSample.add("mano");
        listSample.add("har har");

//         Getting the size of list
//         System.out.println("listSample: " + listSample.size());
//         System.out.println("listSampleTwo: " + listSampleTwo.size());
//         ----
//         --- 
//         Getting the value inside the list
//         System.out.println(listSample.get(0));
//         ----
//         ----
//         Checking the content of the list
//        boolean isContain = listSample.contains("mano");
//        System.out.println("isContain at listSampleTwo: " + isContain);
//         ----
//         ----
//         Checking the index of the specific value
//        int indexVal = listSample.indexOf("mano");
//        System.out.println("indexValue of listSample: " + indexVal);
//         ----
//         ----
//         Remove the value in the array and print all values
        System.out.println(listSample.remove("mano"));
        for (String temp : listSample) {
            System.out.println(temp);
        }
        for (int counter = 0; counter < listSample.size(); counter++) {
            System.out.println(listSample.get(counter));
        } // SAME AS THE ABOVE LOOP
    }
}
