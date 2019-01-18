/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.one.partOne;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ITRO
 */
public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> foodStore = new HashMap<>();
//      Add the key-value in map
        foodStore.put("Gourment", 6000);
        foodStore.put("UCC", 9999);
        foodStore.put("Yakimix", 11111);

//        Checking if the shop is in the foodStore
//        System.out.println(foodStore.get("jollibee"));
//        System.out.println("jollibee is: " + foodStore.getOrDefault("jollibee", -1));
//        --
//        --
//        Display all foodStore
        for (String key : foodStore.keySet()) {
            System.out.println("value: " + foodStore.get(key));
        }

    }
}
