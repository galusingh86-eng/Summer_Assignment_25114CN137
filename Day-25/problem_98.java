// write a program to find common characters in strings.

import java.util.Scanner;

public class problem_98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("Common characters are:");

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if (str2.indexOf(ch) != -1) {
                System.out.print(ch + " ");

                // Remove duplicate characters from output
                str2 = str2.replace(String.valueOf(ch), "");
            }
        }

        sc.close();
    }
}