package com.home.java9;

public interface Bank {

    double getBalance();

    void deposit(double amount);

    void withdraw(double amount);

    default void executeTransaction(String type, double amount) {
        if (type.equalsIgnoreCase("deposit")) {
            deposit(amount);
            logTransaction(type, amount);
        } else if (type.equalsIgnoreCase("withdraw") &&
                sufficientFunds(amount)) {
            withdraw(amount);
            logTransaction(type, amount);
        } else {
            System.out.println("Transaction Failed.Insufficient Funds");
        }
    }

    private void logTransaction(String type, double amount) {
        System.out.println("Transaction: " + type);
        System.out.println("Amount: " + amount);
        System.out.println("Current Balance: " + getBalance());
    }

    private boolean sufficientFunds(double amount) {
        return getBalance() >= amount;
    }
}
