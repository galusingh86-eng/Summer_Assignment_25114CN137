// write a program to create employee management system.

import java.util.Scanner;

class Employee {
    int empId;
    String name;
    String department;
    double salary;

    Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------------");
    }
}

public class problem_106 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[100];
        int count = 0;

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.next();

                    System.out.print("Enter Department: ");
                    String dept = sc.next();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    employees[count] = new Employee(id, name, dept, salary);
                    count++;

                    System.out.println("Employee added successfully!");
                    break;


                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            employees[i].display();
                        }
                    }
                    break;


                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (employees[i].empId == searchId) {
                            employees[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee not found!");

                    break;


                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {

                        if (employees[i].empId == deleteId) {

                            for (int j = i; j < count - 1; j++) {
                                employees[j] = employees[j + 1];
                            }

                            count--;
                            deleted = true;

                            System.out.println("Employee deleted successfully!");
                            break;
                        }
                    }

                    if (!deleted)
                        System.out.println("Employee not found!");

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