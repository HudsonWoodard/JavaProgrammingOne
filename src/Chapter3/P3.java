package Chapter3;

import java.util.Scanner;

/**
 * Program to display the score a student got on a test
 *
 * @author Hudson Woodard
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // no_1 & no_2 represent numbers one and two
        System.out.print("Enter two numbers: ");
        double no_1 = input.nextDouble();
        double no_2 = input.nextDouble();

        if (no_1 < no_2) {
            System.out.println("The first number is less than the second.");
        }

        if (no_1 > no_2) {
            System.out.println("The first number is greater than the second.");
        }

        if (no_1 == no_2) {
            System.out.println("The first number is equal to the second.");
        }

        if (no_1 != no_2) {
            System.out.println("The first number is not equal to the second");
        }

        if (no_2 == 0) {
            System.out.println("Cannot divide by 0");
        } else if (no_1 / no_2 < 1) {
            System.out.println("Proper Fraction");
        } else {
            System.out.println("Improper Fraction");
        }

        if (no_1 >= 90) {
            System.out.println("A");
        } else if (no_1 >= 80) {
            System.out.println("B");
        } else if (no_1 >= 70) {
            System.out.println("C");
        } else if (no_1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (no_2 >= 1
                && no_2 <= 100) {
            System.out.println("In Range");
        } else {
            System.out.println("Out of Range");
        }
    }

}
