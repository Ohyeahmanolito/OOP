/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.one.partOne;

/**
 *
 * @author ITRO
 */
public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal("henry", "meow meow");
        
        System.out.println("dog obj: " + dog.getKind());
        System.out.println("cat obj: " + cat.getKind());

        

//        Animal dog = new Animal();
//        Animal cat = new Animal();
//
//        dog.kind = "alfonso";
//
//        System.out.println("dog obj: " + dog.getKind());
//        System.out.println("cat obj: " + cat.getKind());
//
//        dog.name = "fa";
//        System.out.println("dog obj name: " + dog.getName());
//        System.out.println("cat obj name: " + cat.getName());
    }
}
