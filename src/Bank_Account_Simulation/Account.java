package Bank_Account_Simulation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<String> transactionHistory;
    

    // Constructor
    public Account(String accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created on " + new Date() + " with initial balance: $" + initialDeposit);
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: $" + amount + " on " + new Date());
            System.out.println("Deposit successful. Current balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: $" + amount + " on " + new Date());
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Display account balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    // Display transaction history
    public void showTransactionHistory() {
        System.out.println("\nTransaction History for " + accountHolder + ":");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
    }
}
