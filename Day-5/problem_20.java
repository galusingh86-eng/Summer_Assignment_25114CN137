// write a program to find largest prime factors.

import java.util.Scanner;

public class problem_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largestPrimeFactor = 1;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                boolean isPrime = true;

                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    largestPrimeFactor = i;
                }
            }
        }

        System.out.println("Largest Prime Factor = " + largestPrimeFactor);

        sc.close();
    }
}
