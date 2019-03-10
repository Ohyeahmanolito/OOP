/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzes;

/**
 *
 * @author ITRO
 */
public class AstonMartin extends Car {
    
    public AstonMartin() {
        super("GREEN");
    }
    
    @Override
    public void honk() {
        System.out.println("honk inside AstonMartin class");
    }
    
}
