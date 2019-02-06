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

//        SavingAccount saver1 = new SavingAccount(2000);
//        SavingAccount saver2 = new SavingAccount(3000);
//
//        SavingAccount.modifyInterestRate(0.04);
//
//        System.out.println("saver1: " + saver1.calculateMontlyInterest());
//        System.out.println("saver2: " + saver2.calculateMontlyInterest());
//        
//        SavingAccount.modifyInterestRate(0.05);
//        
//        System.out.println("saver1: " + saver1.calculateMontlyInterest());
//        System.out.println("saver2: " + saver2.calculateMontlyInterest());
  
        Date haha = new Date(12, 27, 2018);
        haha.displayDate();
        haha.setDay(99);
        haha.displayDate();
        int month = haha.getMonth();
        System.out.println("the month: " + month);
    }
}
