package geoshapes;

import java.util.Scanner;

public class Sphere {
    double radius;
    Scanner sp = new Scanner(System.in);

    public void getDetails() {
        System.out.println("\n--Enter Sphere details--\n");
        System.out.print("Enter radius of circle : " + " ");
        radius = sp.nextDouble();
    }

    public double area() {
        return (4 * Math.PI * radius * radius);
    }

    public double perimeter() {
        return (4 * Math.PI * radius);
    }
}
