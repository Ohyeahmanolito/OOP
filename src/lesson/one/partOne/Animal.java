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
public class Animal {

    String kind;
    private double weight = 2.0;
    private String sound;
    private int counter = 100;
    static String name = "hahaha"; //class variable

    public Animal() {
        System.out.println("empty constructor");
    }

    public Animal(String animalKind, String sound) {
        kind = animalKind;
        this.sound = sound;
        System.out.println("Im here at parametered constructor");
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Animal.name = name;
    }

}
