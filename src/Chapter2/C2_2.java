package Chapter2;

import java.util.Scanner;

/**
 * Program to display the radius of a circle
 *
 * @author Hudson Woodard
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();

        System.out.println("Area = " + radius * radius * Math.PI);

        double area = (radius * radius * Math.PI);

        System.out.println("Volume = " + area * length);
    }
}
