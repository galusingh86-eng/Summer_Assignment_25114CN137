// write a program to develop complete mini projrct using arrays, strings and functions.

import java.util.Scanner;

public class problem_120 {

    static String[] name = new String[100];
    static int[] rollNo = new int[100];
    static int[] marks = new int[100];

    static int count = 0;

    // Function to add student
    static void addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo[count] = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Student Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();

        count++;

        System.out.println("Student Added Successfully!");
        sc.close();
    }


    // Function to display students
    static void displayStudents() {

        if(count == 0) {
            System.out.println("No Records Available!");
        }
        else {
            System.out.println("\n--- Student Records ---");

            for(int i = 0; i < count; i++) {
                System.out.println("Roll No: " + rollNo[i]);
                System.out.println("Name: " + name[i]);
                System.out.println("Marks: " + marks[i]);
                System.out.println("-------------------");
            }
        }
    }


    // Function to search student
    static void searchStudent() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number to Search: ");
        int r = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < count; i++) {

            if(rollNo[i] == r) {

                System.out.println("Student Found!");
                System.out.println("Name: " + name[i]);
                System.out.println("Marks: " + marks[i]);

                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Student Not Found!");
        }
        sc.close();
    }


    // Function to calculate average marks
    static void calculateAverage() {

        int total = 0;

        for(int i = 0; i < count; i++) {
            total = total + marks[i];
        }

        if(count > 0) {
            System.out.println("Average Marks: " + (total / count));
        }
        else {
            System.out.println("No Data Available!");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n--- Mini Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Calculate Average");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();


            switch(choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    calculateAverage();
                    break;

                case 5:
                    System.out.println("Project Closed!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 5);

        sc.close();
    }
}