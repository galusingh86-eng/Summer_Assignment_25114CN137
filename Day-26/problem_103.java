// write a program to create atm simulation.

import java.util.Scanner;

public class problem_103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int pin = 1234;

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            int choice;

            do {
                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your balance is: ₹" + balance);
                        break;

                    case 2:
                        System.out.print("Enter withdrawal amount: ₹");
                        int withdraw = sc.nextInt();

                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Please collect your cash.");
                            System.out.println("Remaining balance: ₹" + balance);
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter deposit amount: ₹");
                        int deposit = sc.nextInt();

                        balance += deposit;
                        System.out.println("Money deposited successfully.");
                        System.out.println("Updated balance: ₹" + balance);
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 4);

        } else {
            System.out.println("Incorrect PIN.");
        }

        sc.close();
    }
}