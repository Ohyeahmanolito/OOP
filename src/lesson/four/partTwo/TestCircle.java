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
public class TestCircle {

    public static void main(String[] args) {

        Triangle smallTri = new Triangle();
        System.out.println(smallTri);

        Shape smallTri2 = new Triangle(); //polymorph
        System.out.println(smallTri2);

        Triangle smallTri3 = (Triangle) smallTri2;
        System.out.println(smallTri3);

    }
}
