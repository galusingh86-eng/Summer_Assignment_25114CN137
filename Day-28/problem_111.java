// write a program to create ticket booking system.

import java.util.Scanner;

class Ticket {
    String passengerName;
    int ticketNumber;
    String destination;
    double price;
    boolean booked;

    void bookTicket() {
        if (!booked) {
            booked = true;
            System.out.println("Ticket booked successfully.");
        } else {
            System.out.println("Ticket is already booked.");
        }
    }

    void cancelTicket() {
        if (booked) {
            booked = false;
            System.out.println("Ticket cancelled successfully.");
        } else {
            System.out.println("No ticket found.");
        }
    }

    void displayTicket() {
        System.out.println("\n----- Ticket Details -----");
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Price: " + price);
        System.out.println("Status: " + (booked ? "Booked" : "Available"));
    }
}

public class problem_111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ticket t = new Ticket();

        System.out.println("----- Ticket Booking System -----");

        System.out.print("Enter Ticket Number: ");
        t.ticketNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Passenger Name: ");
        t.passengerName = sc.nextLine();

        System.out.print("Enter Destination: ");
        t.destination = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        t.price = sc.nextDouble();

        t.booked = false;

        int choice;

        do {
            System.out.println("\n1. Display Ticket");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    t.displayTicket();
                    break;

                case 2:
                    t.bookTicket();
                    break;

                case 3:
                    t.cancelTicket();
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