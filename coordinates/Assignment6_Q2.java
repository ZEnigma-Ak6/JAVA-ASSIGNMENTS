//2021PGCACA062 Assignment 6 Program 2

package coordinates;

import coordinates.Cartesian;
import coordinates.Polar;

public class Assignment6_Q2 {

    public static void main(String args[]) {
        Cartesian cartesian = new Cartesian(5, 7);
        Polar polar = new Polar(5, 9.9);

        cartesian.toPolar();
        polar.toCartesian();
    }
}