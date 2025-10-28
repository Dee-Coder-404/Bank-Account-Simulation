package Bank_Account_Simulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create new account
        System.out.print("Enter account number: ");
        String accNum = sc.nextLine();

        System.out.print("Enter account holder name: ");
        String accHolder = sc.nextLine();

        System.out.print("Enter initial deposit amount: ");
        double initialDeposit = sc.nextDouble();

        Account account = new Account(accNum, accHolder, initialDeposit);

        // Menu for operations
        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Show Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    account.showTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you for using our banking system!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
