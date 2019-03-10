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
public class Ferrari extends Car {

    public Ferrari() {
    }

    Ferrari(String color) {
        super(color);
    }

    @Override
    public void whoIsTheDriver(ArrayList<Person> people) {
        this.setPeople(people);
        if (!people.isEmpty()) {
            System.out.println(people.get(people.size() - 1).getName() + " is the driver");
        } else {
            System.out.println("no driver");
        }
    }
}
