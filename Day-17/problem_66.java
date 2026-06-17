// write a program to union of arrays.

import java.util.Scanner;

public class problem_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] union = new int[n1 + n2];
        int k = 0;

        // Add elements of first array
        for (int i = 0; i < n1; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (union[j] == arr1[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                union[k++] = arr1[i];
            }
        }

        // Add elements of second array
        for (int i = 0; i < n2; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (union[j] == arr2[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                union[k++] = arr2[i];
            }
        }

        // Display union array
        System.out.println("Union of arrays:");
        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }

        sc.close();
    }
}
