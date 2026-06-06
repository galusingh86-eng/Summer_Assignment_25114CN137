//  write a program to count set bits in a number.

import java.util.Scanner;

public class problem_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num > 0) {
            count = count + (num % 2);
            num = num / 2;
        }

        System.out.println("Number of set bits = " + count);

        sc.close();
    }
}