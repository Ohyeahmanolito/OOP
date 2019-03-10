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
public class TestShape {

    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 4, 5);  // Upcast
        System.out.println(s1);  // Run Rectangle's toString()
        System.out.println("Area is " + s1.getArea());  // Run Rectangle's getArea()

        Shape s2 = new Triangle("blue", 4, 5);  // Upcast
        System.out.println(s2);  // Run Triangle's toString()
        System.out.println("Area is " + s2.getArea());  // Run Triangle's getArea()

        Rectangle tingl = (Rectangle) s2;
        System.out.println("tingl: " + tingl);
        System.out.println("tingl area: " + tingl.getArea());

        //Circle c1 = new Cylinder(1.1, 2.2);  // upcast is safe
        //Cylinder cy1 = (Cylinder) c1;        // downcast needs the casting operator
    }
}
