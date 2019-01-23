/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.two.partTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ITRO
 */
public class CollectionWithPerson {

    public static void main(String[] args) {
        mapExample();

    }

    public static void listExample() {
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

    public static void mapExample() {
        
        Map<String, Person> record = new HashMap<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("You want to add person? ");
            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("Y")) {
                System.out.println("User ID: ");
                String idVal = input.nextLine();

//            If the ID is NOT available
                if (record.containsKey(idVal)) {
                    System.out.println("Generate new ID values ");
                } else {
                    Person person = new Person();
//              Get the name of the person.
                    System.out.print("Name: ");
                    userInput = input.nextLine();

                    person.setName(userInput);

//              Get the age of the person and convert to int.
                    System.out.print("Age: ");
                    userInput = input.nextLine();
                    person.setAge(Integer.parseInt(userInput));

//                Add the details in the record
                    record.put(idVal, person);
                }
            } else {
                break;
            }
        }

        System.out.println("\n\nAll people in record:");
        for (String idNumber : record.keySet()) {
            System.out.println("ID NUMBER: " + idNumber);
            System.out.println("name: " + record.get(idNumber).getName());
            System.out.println("age: " + record.get(idNumber).getAge());
        }
    }

}
