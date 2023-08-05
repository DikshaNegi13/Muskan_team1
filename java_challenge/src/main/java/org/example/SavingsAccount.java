package org.example;

public class SavingsAccount extends BankAccount{

    public void withdraw(double amount){
        if (amount<100||(balance-amount<100))
        {
            System.out.println("Amount cannot be withdrawn");
        }
        else {
            balance -= amount;
        }
    }

}
