//2021PGCACA062 Assignment 9 Question 2

//User input program to use HashMap to implement login id and password database. Use the same to verify the username and password of a given user


import java.util.HashMap;
import java.util.Scanner;

public class Assignment9_Q2 {
    public static void main(String[] args) {
        Scanner A9_Q2 = new Scanner(System.in);
        HashMap<String, String> loginMap = new HashMap<String, String>();
        System.out.println("--Sign up-- \n Enter username");
        String username = A9_Q2.next();
        System.out.println("Enter password");
        String password = A9_Q2.next();
        loginMap.put(username, password);
        System.out.println("--Login-- \n Enter username");
        String username1 = A9_Q2.next();
        System.out.println("Enter password");
        String password1 = A9_Q2.next();
        if (loginMap.containsKey(username1)) {
            if (loginMap.get(username1).equals(password1)) {
                System.out.println("Verified! Login successful!!");
            } else {
                System.out.println("Wrong! Login failed!!");
            }
        } else {
            System.out.println("Login failed");
        }

    }
}

