// write a program to find first non repeating character.

import java.util.*;

public class problem_89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = '\0';

        for (int i = 0; i < str.length(); i++) {
            boolean repeat = false;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    repeat = true;
                    break;
                }
            }

            if (!repeat) {
                result = str.charAt(i);
                break;
            }
        }

        if (result != '\0')
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found");

        sc.close();
    }
}