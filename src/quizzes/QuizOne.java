/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzes;

import java.util.HashMap;

/**
 *
 * @author ITRO
 */
public class QuizOne {

    public static void main(String[] args) {
        questionTwo();
    }

    public static void questionOne() {

        int var = -27 / 6;
        int anotherVar = ((7 % 2) * 2) / 3;
        System.out.println(var);
        System.out.println("ano"+anotherVar);
    }

    public static void questionTwo() {
        int sum = 0;
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < y; x++) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }

    public static void questionThree() {
        int sum = 0;
        int x;
        for (x = 0; x < 4; x++) {
            sum += sum + 2;
        }
        System.out.println(sum);
    }

//    public static void questionFour() {
//        ArrayList<String> ageList = new ArrayList<>();
//        ageList.add(19);
//        ageList.add(24);
//
//        String ageInString = ageList.get(0);
//    }
    public static void questionFive() {

        int var1 = 4;
        int var2 = 2;
        int var3 = 6;
        for (int x = 2; x < 5; x++) {
            var1 += x;
        }

        var3 = var1;
        var3++;
        var2 = var3;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }

    public static void questionSix() {
        HashMap<String, String> kingdom = new HashMap<>();

        kingdom.put("Hailey", "love");
        kingdom.put("dada", "love");
        kingdom.put("mama", "ugly");

        System.out.println(kingdom.get("ugly"));
    }

    public static void questionSeven() {
        int sum = 0;
        int x;
        for (x = 0; x < 5; x++) {
            while (true) {
                sum += 2;
                x++;
                if (x == 4) {
                    break;
                }
            }

        }
        System.out.println("x " + x);
        System.out.println(sum);
    }

    public static void questionEight() {
        int sum = 2;
        int x;
        int y;
        for (x = 0; x < 5; x += 3) {
            for (y = 0; y < x; x++) {
                sum += 2;
            }
        }

    }
}
