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
public class SavingAccount {

    private static double annualInterestRate;
    private double savingBalance;

    public SavingAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double calculateMontlyInterested() {
        return ((annualInterestRate * savingBalance) / 12);
    }

    public static void modifyInterestRate(double interestRate) {
        annualInterestRate = interestRate;
    }
}
