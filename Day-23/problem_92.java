// write a program to find maximum occurring character.

import java.util.*;

public class problem_92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int maxCount = 0;
        char maxChar = '\0';

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        if (maxChar != '\0'){
            System.out.println("Maximum occurring character: " + maxChar);
            System.out.println("Frequency: " + maxCount);
        }
        else
            System.out.println("String is empty");

        sc.close();
    }
}