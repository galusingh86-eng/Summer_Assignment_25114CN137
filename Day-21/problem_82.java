// write a program to reverse a string.

import java.util.Scanner;

public class problem_82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = "";

        // Reversing the string using loop
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reverse of string = " + reverse);

        sc.close();
    }
}