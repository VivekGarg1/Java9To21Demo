package com.home.java9;

public class BankClientTest {

    public static void main(String[] args) {
        Bank b = new SavingAccount(1000);
        System.out.println("Current Balance is: " + b.getBalance());
        b.executeTransaction("deposit",500);
        b.executeTransaction("withdraw",200);
        b.executeTransaction("withdraw",2000);
        System.out.println("Final Balance is: " + b.getBalance());
    }
}
