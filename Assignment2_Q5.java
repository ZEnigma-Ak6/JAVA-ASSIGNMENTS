//2021PGCACA062 Assignment 2 Program 5

import java.util.*;

public class Assignment2_Q5
{
    public static void main (String[]args)
    {

        int size;
        Scanner as5 = new Scanner (System.in);

        System.out.println ("Enter size of array: ");
        size = as5.nextInt ();

        System.out.println ("Enter elements of array: ");
        int[] a = new int[size];

        for (int i = 0; i < size; i++)
            a[i] = as5.nextInt ();

        for(int i=0;i<size;i++){
            int count=1;

            if(a[i]==-1)
                continue;

            for(int j=i+1;j<size;j++)
                if(a[j]==a[i]){
                    a[j]=-1;
                    count++;
                }

            System.out.println("Freq of "+a[i]+" = "+count);
        }

    }
}
