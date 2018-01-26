package Chapter2;

import java.util.Scanner;

/**
 * Program to convert a temperature from degrees Celcius to degrees Fahrenheit
 *
 * @author Hudson Woodard
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in degrees Celcius: ");
        double Temp = input.nextDouble();

        System.out.print("The temperature in degrees Fahrenheit = " + ((9.0 / 5) * Temp + 32));
    }
}
