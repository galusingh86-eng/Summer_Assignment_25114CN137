// write a program to remove spaces from string.

import java.util.Scanner;

public class problem_88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        // Remove spaces
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }

        System.out.println("String after removing spaces: " + result);

        sc.close();
    }
}