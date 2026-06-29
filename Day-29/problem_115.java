// write a program to create menu- driven string operations system.

import java.util.Scanner;

public class problem_115 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "";
        int choice;

        do {
            System.out.println("\n----- String Operations Menu -----");
            System.out.println("1. Enter String");
            System.out.println("2. Display String");
            System.out.println("3. Find String Length");
            System.out.println("4. Reverse String");
            System.out.println("5. Convert to Uppercase");
            System.out.println("6. Convert to Lowercase");
            System.out.println("7. Check Palindrome");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter a string: ");
                    str = sc.nextLine();
                    System.out.println("String saved successfully!");
                    break;

                case 2:
                    System.out.println("String is: " + str);
                    break;

                case 3:
                    System.out.println("Length of string = " + str.length());
                    break;

                case 4:
                    String reverse = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverse = reverse + str.charAt(i);
                    }
                    System.out.println("Reverse string = " + reverse);
                    break;

                case 5:
                    System.out.println("Uppercase string = " + str.toUpperCase());
                    break;

                case 6:
                    System.out.println("Lowercase string = " + str.toLowerCase());
                    break;

                case 7:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev = rev + str.charAt(i);
                    }

                    if (str.equals(rev)) {
                        System.out.println("String is Palindrome");
                    } else {
                        System.out.println("String is not Palindrome");
                    }
                    break;

                case 8:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}