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
class Car {

    private ArrayList<Person> people = new ArrayList<>();
    private String color = "RED";

    public Car() {
        System.out.println("Inside Car class");
    }

    public Car(String color) {
        this.color = color;
    }

    public void honk() {
        System.out.println("honk inside Car class");
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public void whoIsTheDriver(ArrayList<Person> people) {
        setPeople(people);
        if (!people.isEmpty()) {
            System.out.println(people.get(0).getName() + " is the driver");
        } else {
            System.out.println("no driver");
        }
    }

    public String toString() {
        String temp = "";
        if (!people.isEmpty()) {
            for (Person pip : people) {
                temp += pip.getName() + ", ";
            }
            return "The people in the " + color + " car: [" + temp + "]";
        } else {
            return "No people in the " + color + " car";
        }
    }

}
