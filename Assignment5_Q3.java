
import java.util.*;
import java.lang.*;

class UserNumericString extends Exception {
    private double a;
    private double b;

    public String toString() {
        return "Exception: String contains number values as substring in it.";
    }
}

public class Assignment5_Q3 {

    public static void main(String[] args) {

        String str;
        Scanner As5_3 = new Scanner(System.in);

        System.out.println("Enter a string: ");
        str = As5_3.next();

        try {

            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    throw new UserNumericString();
                }
            }

            System.out.println("String is: " + str);

        } catch (Exception exc) {
            System.out.println("Caught: " + exc);
        }


    }

}
