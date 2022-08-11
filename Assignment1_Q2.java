//2021PGCACA062_Program2

import java.util.Scanner;

class Assignment1_Q2 {
    public static void main(String args[]) {

        System.out.println("Enter a number = ");
        Scanner as2 = new Scanner(System.in);
        int n = as2.nextInt();

        System.out.println("X ");
        for (int i = 0; i < n; i++)
            System.out.print( i + " ");
        System.out.println();

        for (int i = 0; i < n; i++){
            System.out.print(i + " " );
        for (int j = 0; j < n; j++)
            System.out.print((i * j)%n + " ");
        System.out.println();
    }

    }

}
