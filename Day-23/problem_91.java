// write a program to check anagram strings.

import java.util.*;

public class problem_91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Remove spaces and convert to lowercase
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();

        boolean isAnagram = true;

        if (str1.length() != str2.length()) {
            isAnagram = false;
        } 
        else {
            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (!Arrays.equals(arr1, arr2)) {
                isAnagram = false;
            }
        }

        if (isAnagram)
            System.out.println("Strings are Anagram");
        else
            System.out.println("Strings are not Anagram");

        sc.close();
    }
}