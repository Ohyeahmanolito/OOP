/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.four.partOne;

/**
 *
 * @author ITRO
 */
public class Rectangle extends Shape {
    // Private member variables

    private int length;
    private int width;

    // Constructor
    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
    }

    // Override the inherited getArea() to provide the proper implementation
    @Override
    public double getArea() {
        return length * width;
    }
}
