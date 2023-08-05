package org.example;

public class BankAccount{
  protected String account_name;
  protected double balance;

   public BankAccount(){

   }


    public BankAccount(String account_name, double balance) {
        this.account_name = account_name;
        this.balance = balance;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        balance-=amount;
    }

}

