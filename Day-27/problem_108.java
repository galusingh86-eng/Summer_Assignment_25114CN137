// write a program to create marksheet generation system.

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks1, marks2, marks3;
    int total;
    double percentage;
    String grade;

    void calculateResult() {
        total = marks1 + marks2 + marks3;
        percentage = total / 3.0;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "Fail";
        }
    }

    void displayMarksheet() {
        System.out.println("\n----- Marksheet -----");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Student Name: " + name);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class problem_108 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.println("----- Marksheet Generation System -----");

        System.out.print("Enter Roll Number: ");
        s.rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        s.marks1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        s.marks2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        s.marks3 = sc.nextInt();

        s.calculateResult();

        s.displayMarksheet();

        sc.close();
    }
}