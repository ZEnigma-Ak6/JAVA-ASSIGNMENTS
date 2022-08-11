// 2021PGCACA062  Assignment 2 Program 3

import java.util.*;
public class Assignment2_Q3
{
    public static void main(String[] args) {
        Scanner as3 = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int a=as3.nextInt(),b=as3.nextInt();
        int val;
        if(a<b)
            val= a;
        else
            val = b;
        int gcd=1;
        for(int i=2;i<=val;i++)
            if(a%i==0 && b%i==0)
                gcd= i;
        System.out.println("Iterative method GCD: "+gcd);
        System.out.println("GCD using recursive method: "+Gcd(a,b));
    }
    static int Gcd(int a,int b){
        if (b==0)
            return a;
        return Gcd(b,a%b);
    }
}
