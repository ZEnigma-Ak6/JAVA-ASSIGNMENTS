//2021PGCACA062 Assignment 8 Question 2

import java.util.Scanner;

public class Assignment8_Q2 {

    public static void main(String[] args) {
        Scanner A8_2 = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = A8_2.nextLine();
        insertString(str);
        replaceString(str);
        deleteString(str);

    }

    public static void insertString(String str) {
        Scanner A8_2 = new Scanner(System.in);
        System.out.println("Enter the string to be inserted : ");
        String str1 = A8_2.nextLine();
        System.out.println("Enter the index at which the string is to be inserted : ");
        int index = A8_2.nextInt();
        System.out.println("The string after inserting is : " + str.substring(0, index) + str1 + str.substring(index));
    }

    public static void replaceString(String str) {
        Scanner A8_2 = new Scanner(System.in);
        System.out.println("Enter the string to be replaced : ");
        String str1 = A8_2.nextLine();
        System.out.println("Enter the index at which the string is to be replaced : ");
        int index = A8_2.nextInt();
        System.out.println("The string after replacing is : " + str.substring(0, index) + str1
                + str.substring(index + str1.length()));
    }

    public static void deleteString(String str) {
        Scanner A8_2 = new Scanner(System.in);
        System.out.println("Enter the index at which the string is to be deleted : ");
        int index = A8_2.nextInt();
        System.out.println("Enter the length of the string to be deleted : ");
        int length = A8_2.nextInt();
        System.out.println("The string after deleting is : " + str.substring(0, index) + str.substring(index + length));
    }
}
