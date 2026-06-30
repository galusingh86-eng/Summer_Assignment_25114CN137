// write a program to create mini employee management system.

import java.util.Scanner;

public class problem_119 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] empId = new int[100];
        String[] empName = new String[100];
        String[] department = new String[100];
        double[] salary = new double[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Mini Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId[count] = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Department: ");
                    department[count] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;

                    System.out.println("Employee Added Successfully!");
                    break;


                case 2:
                    System.out.println("\nEmployee Records:");

                    for(int i = 0; i < count; i++) {
                        System.out.println("Employee ID: " + empId[i]);
                        System.out.println("Name: " + empName[i]);
                        System.out.println("Department: " + department[i]);
                        System.out.println("Salary: " + salary[i]);
                        System.out.println("---------------------");
                    }
                    break;


                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < count; i++) {
                        if(empId[i] == searchId) {
                            System.out.println("Employee Found!");
                            System.out.println("Name: " + empName[i]);
                            System.out.println("Department: " + department[i]);
                            System.out.println("Salary: " + salary[i]);

                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Employee Not Found!");
                    }
                    break;


                case 4:
                    System.out.println("Exiting System...");
                    break;


                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 4);

        sc.close();
    }
}