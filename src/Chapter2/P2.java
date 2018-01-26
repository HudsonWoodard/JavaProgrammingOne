package Chapter2;

import java.util.Scanner;

/**
 * Program to display the full price of a meal
 *
 * @author Hudson Woodard
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price of meal: ");
        double Meal = input.nextDouble();

        System.out.print("Enter price of drink: ");
        double Drink = input.nextDouble();

        System.out.print("Enter price of dessert: ");
        double Dessert = input.nextDouble();

        double Total = (Meal + Drink + Dessert);
        double TotalTax = (Total + (Total * .1));
        System.out.println("Price of food = " + Total);
        System.out.println("Tax = " + (Total * .10));
        System.out.println("Tip = " + (Total * .15));
        System.out.println("Sum of the entire meal = " + (Total + (Total * .1) + (TotalTax * .15)));

    }
}
