// write a program to create bank account system.

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayAccount() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class problem_110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.println("----- Bank Account System -----");

        System.out.print("Enter Account Number: ");
        account.accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        account.accountHolder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        account.balance = sc.nextDouble();

        int choice;

        do {
            System.out.println("\n1. Display Account Details");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    account.displayAccount();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 4:
                    System.out.println("Thank you for using bank system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 4);

        sc.close();
    }
}