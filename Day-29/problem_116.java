// write a program to create inventory management system.

import java.util.Scanner;

public class problem_116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] product = new String[100];
        int[] quantity = new int[100];
        double[] price = new double[100];

        int n = 0;
        int choice;

        do {
            System.out.println("\n----- Inventory Management System -----");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter product name: ");
                    product[n] = sc.nextLine();

                    System.out.print("Enter quantity: ");
                    quantity[n] = sc.nextInt();

                    System.out.print("Enter price: ");
                    price[n] = sc.nextDouble();

                    n++;
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.println("\nProduct Details:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Name: " + product[i]);
                        System.out.println("Quantity: " + quantity[i]);
                        System.out.println("Price: " + price[i]);
                        System.out.println("----------------");
                    }
                    break;

                case 3:
                    System.out.print("Enter product name to search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (product[i].equalsIgnoreCase(search)) {
                            System.out.println("Product Found");
                            System.out.println("Quantity: " + quantity[i]);
                            System.out.println("Price: " + price[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter product name to update: ");
                    String update = sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        if (product[i].equalsIgnoreCase(update)) {
                            System.out.print("Enter new quantity: ");
                            quantity[i] = sc.nextInt();
                            System.out.println("Quantity updated successfully!");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("System closed.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}