// write a program to find sum and average of array.

import java.util.Scanner;

public class problem_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;
        float average;

        // Input array elements
        System.out.println("Enter 5 elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Find sum
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // Find average
        average = sum / (float) arr.length;

        System.out.println("Sum of array elements = " + sum);
        System.out.println("Average of array elements = " + average);

        sc.close();
    }
}