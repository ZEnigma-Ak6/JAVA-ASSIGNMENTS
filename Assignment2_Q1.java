//2021PGCACA062 Assignment 2 Program 1

import java.util.*;
public class Assignment2_Q1
{
    public static void main(String[] args) {
        System.out.println("Enter the end points of First line: ");
        Scanner as1 = new Scanner(System.in);

        int x1 =as1.nextInt();
        int y1 =as1.nextInt();
        int x2 =as1.nextInt();
        int y2 =as1.nextInt();

        int p =((y2-y1)/(x2-x1));

        System.out.println("Enter the end points of Second line: ");

        int x3 =as1.nextInt();
        int y3 =as1.nextInt();
        int x4 =as1.nextInt();
        int y4 =as1.nextInt();

        int i =((y4-y3)/(x4-x3));

        if(p==i)
            System.out.println("Lines are parallel. ");
        else
            System.out.println("Lines intersecting. ");
    }

}

