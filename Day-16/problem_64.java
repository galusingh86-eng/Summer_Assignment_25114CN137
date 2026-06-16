// write a program to remove duplicates from an array.

import java.util.Scanner;

public class problem_64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int newArr[] = new int[n];
        int newSize = 0;

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            for (int j = 0; j < newSize; j++) {
                if (arr[i] == newArr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                newArr[newSize] = arr[i];
                newSize++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < newSize; i++) {
            System.out.print(newArr[i] + " ");
        }

        sc.close();
    }
}


