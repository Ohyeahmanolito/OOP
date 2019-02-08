/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.three.solution;

/**
 *
 * @author ITRO
 */
public class AuthorDemo {

    public static void main(String[] args) {
        Author hans = new Author("hans", "nu", 'f');
        Book noli = new Book("The Noli", hans, 2);
        
        System.out.println(noli);

    }
}
