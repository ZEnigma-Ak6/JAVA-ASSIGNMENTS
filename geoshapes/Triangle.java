package geoshapes;

import java.util.Scanner;

public class Triangle {
    double base, s1, s2, s3,S;
    Scanner tri = new Scanner(System.in);

    public void getDetails() {
        System.out.println("\n--Enter Triangle details-- \n ");
        System.out.print("Enter side 1 of triangle:" + " ");
        s1 = tri.nextDouble();
        System.out.print("Enter side 2 of triangle:" + " ");
        s2 = tri.nextDouble();
        System.out.print("Enter side 3 of triangle:" + " ");
        s3 = tri.nextDouble();
    }

    public double area() {
        S =(s1 + s2 + s3)/2;

        return (Math.sqrt(S * (S - s1) * (S - s2) * (S - s3)));
    }

    public double perimeter() {
        return (s1 + s2 + s3);
    }
}
