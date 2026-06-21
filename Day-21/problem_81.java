// write a program to find string lenght without strlen().

import java.util.Scanner;

public class problem_81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = 0;

        // Counting characters manually
        for (int i = 0; i < str.length(); i++) {
            length++;
        }

        System.out.println("Length of string = " + length);

        sc.close();
    }
}