// write a program to create student record system using arrays and strings.

// Program to create Student Record System using Arrays and Strings

import java.util.Scanner;

public class problem_117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[100];
        int[] rollNo = new int[100];
        int[] marks = new int[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Add Student Record");
            System.out.println("2. Display Student Records");
            System.out.println("3. Search Student Record");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll Number: ");
                    rollNo[count] = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextInt();

                    count++;
                    System.out.println("Record Added Successfully!");
                    break;

                case 2:
                    System.out.println("\nStudent Records:");
                    for (int i = 0; i < count; i++) {
                        System.out.println("Roll No: " + rollNo[i]);
                        System.out.println("Name: " + name[i]);
                        System.out.println("Marks: " + marks[i]);
                        System.out.println("--------------------");
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == searchRoll) {
                            System.out.println("Record Found!");
                            System.out.println("Name: " + name[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Record Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}