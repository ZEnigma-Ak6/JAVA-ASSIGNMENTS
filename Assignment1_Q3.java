//2021PGCACA062_Program3

import java.util.Scanner;

class Assignment1_Q3 {
    public static void main(String[] args) {

        System.out.println("1. Enter the feet to convert it in meters : ");
        System.out.println("2. Enter the minutes to convert it in years and days : ");
        System.out.println("3. Enter the horse power to convert it in joules : ");

        System.out.println("Enter your choice : ");
        Scanner as3= new Scanner(System.in);
        int ch = as3.nextInt();

        switch(ch)
        {
            case 1:
                System.out.println("Enter the value in feet: ");
                double feet = as3.nextDouble();
                System.out.println("Feet in meter : " + feet/3.281);
                break;

            case 2:
                System.out.println("Enter the value in Minute: ");
                long min = as3.nextLong();
                System.out.println("Years : " + min/(365*24*60) + " Days : " + (min%(365*24*60))/(24*60));
                break;

            case 3:
                System.out.println("Enter the value in Horse_power : ");
                double HPr = as3.nextDouble();
                System.out.println("Horse_power in Joules : " + HPr*745.699);
                break;

            default:
                System.out.println("Enter the right input");
        }
    }

}
