package geoshapes;

import java.util.Scanner;

public class Circle {
    Scanner cr = new Scanner(System.in);
    double radius;

    public void getDetails() {
        System.out.println("\n --Enter Circle details-- \n ");
        System.out.print("Enter radius of circle:" + " ");
        radius = cr.nextDouble();
    }

    public double area() {
        return (Math.PI * radius * radius);
    }

    public double perimeter() {
        return (2 * Math.PI * radius);
    }
}
