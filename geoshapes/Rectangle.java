package geoshapes;

import java.util.Scanner;

public class Rectangle {
    double length, breadth;
    Scanner rec = new Scanner(System.in);

    public void getDetails() {
        System.out.println("\n--Enter rectangle details--\n ");
        System.out.print("Enter length of rectangle :" + " ");
        length = rec.nextDouble();
        System.out.print("Enter breadth of rectangle :" + " ");
        breadth = rec.nextDouble();
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}
