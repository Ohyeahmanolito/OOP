/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.four.partOne;

import activity.three.solution.*;

/**
 *
 * @author ITRO
 */
public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;

        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            System.out.println("invalid input");
            this.gender = 'x';
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return ("[Author: " + name + ", email: " + email + " gender: " + gender+"]");
    }
}
