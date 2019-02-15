/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.four.partTwo;

/**
 *
 * @author ITRO
 */
public abstract class Shape {

    private String color;

    public abstract double getArea();

    @Override
    public String toString() {
        return "inside shape";
    }
}
