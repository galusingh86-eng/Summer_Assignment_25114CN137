// write a program to find missing number in an array.

import java.util.Scanner;

public class problem_61{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n - 1];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int i = 0; i < n - 1; i++) {
            arraySum += arr[i];
        }

        int missing = totalSum - arraySum;

        System.out.println("Missing number is: " + missing);

        sc.close();
    }
}