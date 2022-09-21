////2021PGCACA062 Assignment 6 Program 1

package geoshapes;

public class Assignment6_Q1 {
    public static void main(String[] args) {
        //Circle class;
        Circle circle = new Circle();
        circle.getDetails();
        System.out.println("Circle's area is: " + circle.area());
        System.out.println("Circle's perimeter is: " + circle.perimeter());
        Triangle triangle = new Triangle();
        triangle.getDetails();
        System.out.println("Triangle's area is: " + triangle.area());
        System.out.println("Triangle's perimeter is: " + triangle.perimeter());
        Rectangle rect = new Rectangle();
        rect.getDetails();
        System.out.println("Rectangle's area is: " + rect.area());
        System.out.println("Rectangle's perimeter is: " + rect.perimeter());
        Sphere sphere = new Sphere();
        sphere.getDetails();
        System.out.println("Sphere's area is: " + sphere.area());
        System.out.println("Sphere's perimeter is: " + sphere.perimeter());
    }
}