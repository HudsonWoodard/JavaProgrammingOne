package Chapter3;

import java.util.Scanner;

/**
 * Program to tell you if a number is divisible by 5 and/or 6
 *
 * @author Hudson Woodard
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        double number = input.nextDouble();
        System.out.println("The number is divisable by 5 and 6: ");
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("The number is divisable by 5 or 6: ");
        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("The number is divisable by 5 or 6, but not both: ");
        if (number % 5 == 0 && number % 6 != 0) {
            System.out.println("True");
        } else if (number % 5 != 0 && number % 6 == 0) {
            System.out.println("True");
        } else if (number % 5 != 0 && number % 6 != 0) {
            System.out.println("False");
        } else if (number % 5 == 0 && number % 6 == 0) {
            System.out.println("False");
        }
    }

}
