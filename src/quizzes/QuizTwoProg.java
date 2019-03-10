/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzes;

import java.util.ArrayList;

/**
 *
 * @author ITRO
 */
public class QuizTwoProg {

    public static void main(String[] args) {

        String[] names = {"Henry", "Hailey", "Mama", "Dada"};
        ArrayList<Person> people = new ArrayList<>();

        Car firstCar = new AstonMartin();
        System.out.println(firstCar);
        firstCar.honk();
        firstCar.whoIsTheDriver(people);

        for (int counter = 0; counter < names.length; counter++) {
            Person passenger = new Person();
            passenger.setName(names[counter]);
            people.add(passenger);
        }
        firstCar.whoIsTheDriver(people);
        System.out.println(firstCar);

        System.out.println();
        System.out.println("--------");
        System.out.println();

        people = new ArrayList<>();
        Car secondCar = new Ferrari("MADILAW-DILAW");
        System.out.println(secondCar);
        secondCar.honk();
        secondCar.whoIsTheDriver(people);

        for (int counter = 0; counter < names.length; counter++) {
            Person passenger = new Person();
            passenger.setName(names[counter]);
            people.add(passenger);
        }
        secondCar.whoIsTheDriver(people);
        System.out.println(secondCar);

        System.out.println();
        System.out.println("--------");
        System.out.println();

        Car normalCar = new Car();
        System.out.println(normalCar);
    }
}
