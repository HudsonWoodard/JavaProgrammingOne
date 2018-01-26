package Chapter3;

import java.util.Scanner;

/**
 * Program to display which item has the best price per dollar
 *
 * @author Hudson Woodard
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the wight and price of the first item: ");
        double item1_weight = input.nextDouble();
        double item1_price = input.nextDouble();
        System.out.println("Enter the weight and price of the second item");
        double item2_weight = input.nextDouble();
        double item2_price = input.nextDouble();
//item_value is the price per weight unit. It makes it easier to write the "if" statements.
        double item1_value = item1_price / item1_weight;
        double item2_value = item2_price / item2_weight;
        if (item1_value > item2_value) {
            System.out.println("The second item is a better deal.");
        }
        if (item1_value < item2_value) {
            System.out.println("The first item is a better deal.");
        } else if (item1_value == item2_value) {
            System.out.println("The items have the same value");
        }
    }

}
