//2021PGCACA062 Assignment 2 Program 6

import java.util.Scanner;
public class Assignment2_Q6
{

    public static void main(String[] args) {

        Scanner as7=new Scanner(System.in);
        double a,r,n;

        System.out.print("Enter first element: ");
        a=as7.nextFloat();
        System.out.print("Enter common ratio: ");
        r=as7.nextFloat();
        System.out.print("Enter no of terms: ");
        n=as7.nextFloat();

        double rn=1;

        System.out.println("Geometric Progression upto n terms :- ");
        for(int i=1;i<=n;i++)
        {
            double t=a*rn;
            System.out.print(t + " ");
            rn*=r;
        }
    }

}