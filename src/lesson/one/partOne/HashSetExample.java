/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.one.partOne;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ITRO
 */
public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> hashSetValue = new HashSet<>();
        Set<String> animals = new HashSet<>();

//      Add elements
        animals.add("dog");
        animals.add("cat");
        animals.add("rat");
        animals.add("elephant");
        animals.add("rat");

//        size and removing in set
//        System.out.println("size: " + animals.size());
//        System.out.println("remove dog: " + animals.remove("dog"));
//        System.out.println("new size: " + animals.size());
//        System.out.println("remove rat: " + animals.remove("rat"));
//        System.out.println("new size: " + animals.size());
//         ----
//         ----
// Display all values
//        for (String animal : animals) {
//            System.out.println(animal);
//        }
//         ----
//         ----
//        Check if element exists in the set
//        boolean isContains = animals.contains("sean");
//        System.out.println("set contains sean? " + isContains);

    }
}
