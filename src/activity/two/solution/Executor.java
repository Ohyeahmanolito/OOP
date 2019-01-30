/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.two.solution;

/**
 *
 * @author ITRO
 */
public class Executor {

    public static void main(String[] args) {
        Date date = new Date(6, 6, 6);

        date.displayDate();

        date.setDay(4);
        date.displayDate();

        System.out.println("month: " + date.getMonth());

//        SavingAccount saver1 = new SavingAccount(2000);
//        SavingAccount saver2 = new SavingAccount(3000);
//
//        SavingAccount.modifyInterestRate(0.04);
//
//        System.out.println("saver1: " + saver1.calculateMontlyInterested());
//        System.out.println("saver2: " + saver2.calculateMontlyInterested());
//        
//        SavingAccount.modifyInterestRate(0.05);
//        
//        System.out.println("saver1: " + saver1.calculateMontlyInterested());
//        System.out.println("saver2: " + saver2.calculateMontlyInterested());
    }
}
