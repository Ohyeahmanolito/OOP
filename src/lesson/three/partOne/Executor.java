/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.three.partOne;

import java.util.ArrayList;

/**
 *
 * @author ITRO
 */
public class Executor {

    public static void temp() {
        String[] list = {"four", "score", "and", "seven"};
        ArrayList<String> listArr = new ArrayList<>();

        //add elements to list array
        for (String temp : list) {
            listArr.add(temp);
        }

       
        // remove
        for (int counter = listArr.size() - 1; counter >= 0; counter--) {
            if (listArr.get(counter).length() % 2 == 0) {
                listArr.remove(counter);
            }
        }
        // display values
        for (String temp : listArr) {
            System.out.println(": " + temp);
        }
    }

    public static void displayPerson(Person p) {
    }

    public static void main(String[] args) {

        temp();
    }
}
