/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.three.solution;

import java.util.ArrayList;
import java.util.Scanner;
import lesson.two.partTwo.Person;

/**
 *
 * @author ITRO
 */
public class PersonProblemTwo {

    public static void main(String[] args) {

        ArrayList<Person> personList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("You want to add person? ");
            String userInput = input.nextLine();

//            If Y or YES, continue adding person
            if (userInput.equalsIgnoreCase("Y")) {
                Person person = new Person();
//              Get the name of the person.
                System.out.print("Name: ");
                userInput = input.nextLine();
                person.setName(userInput);

//              Get the age of the person and convert to int.
                System.out.print("Age: ");
                userInput = input.nextLine();
                person.setAge(Integer.parseInt(userInput));

//                Add the details in the arrayList
                personList.add(person);
            } else {
                break;
            }
        }

        System.out.println("\n\nAll people in list:");
        for (Person pipz : personList) {
            System.out.println("name: " + pipz.getName());
            System.out.println("age: " + pipz.getAge());
        }

    }
}
