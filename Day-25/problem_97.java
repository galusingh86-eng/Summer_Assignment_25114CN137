// write a program to merge two sorted arrays.

import java.util.Scanner;

public class problem_97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first sorted array: ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of second sorted array: ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge two sorted arrays
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // Copy remaining elements of first array
        while (i < n1) {
            c[k++] = a[i++];
        }

        // Copy remaining elements of second array
        while (j < n2) {
            c[k++] = b[j++];
        }

        System.out.println("Merged Sorted Array:");
        for (i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        sc.close();
    }
}