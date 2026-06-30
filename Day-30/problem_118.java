// write a program to create mini library system.

import java.util.Scanner;

public class problem_118 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] bookName = new String[100];
        String[] author = new String[100];
        boolean[] issued = new boolean[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Mini Library System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    bookName[count] = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    author[count] = sc.nextLine();

                    issued[count] = false;
                    count++;

                    System.out.println("Book Added Successfully!");
                    break;


                case 2:
                    System.out.println("\nBook List:");

                    for(int i = 0; i < count; i++) {
                        System.out.println("Book ID: " + (i + 1));
                        System.out.println("Book Name: " + bookName[i]);
                        System.out.println("Author: " + author[i]);
                        System.out.println("Status: " + 
                            (issued[i] ? "Issued" : "Available"));
                        System.out.println("-------------------");
                    }
                    break;


                case 3:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();

                    if(issueId > 0 && issueId <= count) {
                        if(!issued[issueId - 1]) {
                            issued[issueId - 1] = true;
                            System.out.println("Book Issued Successfully!");
                        } else {
                            System.out.println("Book is already issued!");
                        }
                    } else {
                        System.out.println("Invalid Book ID!");
                    }
                    break;


                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();

                    if(returnId > 0 && returnId <= count) {
                        issued[returnId - 1] = false;
                        System.out.println("Book Returned Successfully!");
                    } else {
                        System.out.println("Invalid Book ID!");
                    }
                    break;


                case 5:
                    System.out.println("Exiting Library System...");
                    break;


                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 5);

        sc.close();
    }
}