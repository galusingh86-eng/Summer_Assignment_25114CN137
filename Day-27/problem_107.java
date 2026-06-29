// write a program to create salary management system.

import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary, hra, da, grossSalary;

    void calculateSalary() {
        hra = basicSalary * 0.20;   // 20% HRA
        da = basicSalary * 0.10;    // 10% DA
        grossSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class problem_107 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("----- Salary Management System -----");

        System.out.print("Enter Employee ID: ");
        emp.empId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        emp.basicSalary = sc.nextDouble();

        emp.calculateSalary();

        emp.display();

        sc.close();
    }
}