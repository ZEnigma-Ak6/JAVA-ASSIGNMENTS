//2021PGCACA062_Program1

import java.util.Scanner;
class Assignment1_Q1 {

    public static void main(String[] args){

        System.out.println("Enter a Number: ");
        Scanner as1=new Scanner(System.in);
        int n=as1.nextInt();

        int leftShift= n << 12;
        int rightShift= n >> 10;
        System.out.println("Left Shift (4096n) =" +leftShift);
        System.out.println("Right Shift (1/1024)n =" +rightShift);

    }

}
