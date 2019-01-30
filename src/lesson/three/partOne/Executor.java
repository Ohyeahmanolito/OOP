/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.three.partOne;

/**
 *
 * @author ITRO
 */
public class Executor {

    public static void displayProfile(Person x) {
        int temp = x.getAge();
        System.out.println("age of person is: " + temp);
        x.temp = "sdfsdf";
    }

    public static void main(String[] args) {

        Person first = new Person();
        Person second = new Person();
        Executor t = new Executor();
        
        System.out.println("first: " + first.temp);
        Executor.displayProfile(second);
        System.out.println("first: " + first.temp);
    }
}
