//2021PGCACA062 Assignment 8 Question 1

import java.util.Scanner;

public class Assignment8_Q1 {
    public static void main(String[] args) {

        Scanner A8_Q1 = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String str1 = A8_Q1.nextLine();
        System.out.print("Enter second string : ");
        String str2 = A8_Q1.nextLine();
        System.out.print("Enter length : ");
        int k = A8_Q1.nextInt();

        CommonSubstring(str1, str2, k);
        A8_Q1.close();
    }

    public static void CommonSubstring(String str1, String str2, int k) {
        int flag = 0;
        for (int i = 0; i < str1.length() - k + 1; i++) {
            for (int j = 0; j < str2.length() - k + 1; j++) {
                if (str1.substring(i, i + k).equals(str2.substring(j, j + k))) {
                    System.out.println(
                            "Common substring of length " + k + " found at index " + i + " in str1 and index " + j
                                    + " in str2");
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("Substring of length " + k + " not found common");
        }
    }
}
