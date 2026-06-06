// write a program to convert binary to decimal.

import java.util.Scanner;

public class problem_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        int decimal = 0, base = 1, remainder;

        while (binary > 0) {
            remainder = binary % 10;
            decimal = decimal + remainder * base;
            base = base * 2;
            binary = binary / 10;
        }

        System.out.println("Decimal equivalent: " + decimal);

        sc.close();
    }
}