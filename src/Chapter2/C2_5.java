package Chapter2;

import java.util.Scanner;

/**
 * Program to display the price of college(Don't quite remember)
 *
 * @author Hudson Woodard
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        double gratuity_rate = (gratuity / 100);
        System.out.println("Gratuity = " + (gratuity_rate * subtotal));
        double total = ((gratuity_rate * subtotal) + subtotal);
        System.out.println("Total = " + total);
    }

}
