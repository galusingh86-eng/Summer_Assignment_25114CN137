// write a program to create student record management system.

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int age;
    double marks;

    Student(int rollNo, String name, int age, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

public class problem_105 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];
        int count = 0;

        while (true) {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student Record");
            System.out.println("2. Display All Records");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student Record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    students[count] = new Student(roll, name, age, marks);
                    count++;

                    System.out.println("Student record added successfully!");
                    break;


                case 2:
                    if (count == 0) {
                        System.out.println("No records found!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            students[i].display();
                        }
                    }
                    break;


                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].rollNo == searchRoll) {
                            students[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student not found!");

                    break;


                case 4:
                    System.out.print("Enter Roll Number to delete: ");
                    int deleteRoll = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].rollNo == deleteRoll) {

                            for (int j = i; j < count - 1; j++) {
                                students[j] = students[j + 1];
                            }

                            count--;
                            deleted = true;
                            System.out.println("Record deleted successfully!");
                            break;
                        }
                    }

                    if (!deleted)
                        System.out.println("Student not found!");

                    break;


                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}