// write a program to create library management system.

import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    String author;
    boolean isIssued;

    void addBook() {
        isIssued = false;
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    void displayBook() {
        System.out.println("\n----- Book Details -----");
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isIssued ? "Issued" : "Available"));
    }
}

public class problem_109 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b = new Book();

        System.out.println("----- Library Management System -----");

        System.out.print("Enter Book ID: ");
        b.bookId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Book Name: ");
        b.bookName = sc.nextLine();

        System.out.print("Enter Author Name: ");
        b.author = sc.nextLine();

        b.addBook();

        int choice;

        do {
            System.out.println("\n1. Display Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    b.displayBook();
                    break;

                case 2:
                    b.issueBook();
                    break;

                case 3:
                    b.returnBook();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 4);

        sc.close();
    }
}