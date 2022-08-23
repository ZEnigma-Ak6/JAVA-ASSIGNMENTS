import java.util.*;

class UserVerySmallNumException extends Exception {
    private double a;
    private double b;

    UserVerySmallNumException(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return "Division of " + a + " /" + b + "is smaller than 0.00001";
    }
}

public class Assignment5_Q2 {

    public static void main(String[] args) {

        double a, b;
        Scanner As5_2 = new Scanner(System.in);

        System.out.println("Enter 2 numbers-");

        a = As5_2.nextDouble();
        b = As5_2.nextDouble();

        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            if (a / b < 0.00001) {
                throw new UserVerySmallNumException(a, b);
            }

            System.out.println("Answer: " + a / b);
        } catch (Exception e) {
            System.out.println("Caught: " + e);
        }


    }

}