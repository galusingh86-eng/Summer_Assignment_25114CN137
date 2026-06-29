// write a program to create menu-driven calculator.

import java.util.Scanner;

public class problem_113 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double a, b, result;

        do {
            System.out.println("\n----- Calculator Menu -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                a = sc.nextDouble();

                System.out.print("Enter second number: ");
                b = sc.nextDouble();

                switch (choice) {
                    case 1:
                        result = a + b;
                        System.out.println("Addition = " + result);
                        break;

                    case 2:
                        result = a - b;
                        System.out.println("Subtraction = " + result);
                        break;

                    case 3:
                        result = a * b;
                        System.out.println("Multiplication = " + result);
                        break;

                    case 4:
                        if (b != 0) {
                            result = a / b;
                            System.out.println("Division = " + result);
                        } else {
                            System.out.println("Cannot divide by zero");
                        }
                        break;
                }
            } 
            else if (choice == 5) {
                System.out.println("Calculator closed.");
            } 
            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}