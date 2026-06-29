// write a program to create contact management system.

import java.util.Scanner;

class Contact {
    String name;
    String phoneNumber;
    String email;

    void addContact() {
        System.out.println("Contact added successfully.");
    }

    void displayContact() {
        System.out.println("\n----- Contact Details -----");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }

    void updateContact(String newPhone) {
        phoneNumber = newPhone;
        System.out.println("Contact updated successfully.");
    }
}

public class problem_112 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Contact c = new Contact();

        System.out.println("----- Contact Management System -----");

        System.out.print("Enter Name: ");
        c.name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        c.phoneNumber = sc.nextLine();

        System.out.print("Enter Email: ");
        c.email = sc.nextLine();

        c.addContact();

        int choice;

        do {
            System.out.println("\n1. Display Contact");
            System.out.println("2. Update Phone Number");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    c.displayContact();
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter New Phone Number: ");
                    String newPhone = sc.nextLine();
                    c.updateContact(newPhone);
                    break;

                case 3:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 3);

        sc.close();
    }
}