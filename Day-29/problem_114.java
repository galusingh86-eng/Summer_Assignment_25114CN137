// write a program to create menu- driven array operations system.

import java.util.Scanner;

public class problem_114 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int n = 0;
        int choice;

        do {
            System.out.println("\n----- Array Operations Menu -----");
            System.out.println("1. Create Array");
            System.out.println("2. Display Array");
            System.out.println("3. Find Sum of Array");
            System.out.println("4. Find Maximum Element");
            System.out.println("5. Find Minimum Element");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number of elements: ");
                    n = sc.nextInt();

                    System.out.println("Enter array elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Array created successfully!");
                    break;

                case 2:
                    System.out.println("Array elements are:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;

                case 3:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Sum of array = " + sum);
                    break;

                case 4:
                    int max = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Maximum element = " + max);
                    break;

                case 5:
                    int min = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Minimum element = " + min);
                    break;

                case 6:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}