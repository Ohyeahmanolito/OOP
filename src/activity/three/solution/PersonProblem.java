/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.three.solution;

/**
 *
 * @author ITRO
 */
import java.util.ArrayList;

public class PersonProblem {

    private String name;
    private int age;

    public PersonProblem(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String args[]) {
        PersonProblem piepie = new PersonProblem("piepie", 30); // constructor contains the name and age.
        PersonProblem niar = new PersonProblem("niar", 30);
        PersonProblem helen = new PersonProblem("helen", 69);

        ArrayList<PersonProblem> people = new ArrayList<PersonProblem>();
        people.add(piepie);
        people.add(niar);
        people.add(helen);
        for (PersonProblem pip : people) {
            String name = pip.getName();
            System.out.println("the name is: " + name);
            int age = pip.getAge();
            System.out.println("the age is: " + age);
        }
    }
}
