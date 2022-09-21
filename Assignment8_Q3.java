//2021PGCACA062 Assignment 8 Question 3

import java.util.Scanner;

public class Assignment8_Q3 {
    public static void main(String[] args) {
        Scanner A8_3 = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = A8_3.nextLine();
        System.out.print("Enter the number of times it has to left shift : ");
        int n = A8_3.nextInt();
        System.out.println("after left shift  -> " + leftShift(str, n));
        System.out.print("Enter the number of times it has to right shift : ");
        n = A8_3.nextInt();
        System.out.println("after right shift -> " + rightShift(str, n));
        A8_3.close();

    }

    public static String leftShift(String str, int n) {
        String str1 = str.substring(n);
        String str2 = str.substring(0, n);
        return str1 + str2;
    }

    public static String rightShift(String str, int n) {
        String str1 = str.substring(str.length() - n);
        String str2 = str.substring(0, str.length() - n);
        return str1 + str2;
    }
}
