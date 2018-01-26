package Chapter4;

import java.util.Scanner;

/**
 * Program to display which of the inputted bidders has the best price per hour
 *
 * @author Hudson Woodard
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the name of the first bidder? ");
        String bidder1 = input.next();
        System.out.println("How may hours of work does " + bidder1 + " require?");
        double bidder1_hours = input.nextDouble();
        System.out.println("How much does " + bidder1 + " charge by the hour?");
        double bidder1_charge = input.nextDouble();

        System.out.println("What is the name of the second bidder?");
        String bidder2 = input.next();
        System.out.println("How many hours of work does " + bidder2 + " require?");
        double bidder2_hours = input.nextDouble();
        System.out.println("How much does " + bidder2 + " charge by the hour?");
        double bidder2_charge = input.nextDouble();

        double bidder1_cost = (bidder1_hours * bidder1_charge);
        double bidder2_cost = (bidder2_hours * bidder2_charge);

        if (bidder1_cost < bidder2_cost) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", bidder1, bidder1_cost, bidder1_hours);
        } else if (bidder1_cost > bidder2_cost) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", bidder2, bidder2_cost, bidder2_hours);
        }

        if (bidder1_cost == bidder2_cost
                && bidder1_hours < bidder2_hours) {
            System.out.printf(bidder1 + " is the winner with an hour count of %4.2f", bidder1_hours);
        } else if (bidder1_cost == bidder2_cost
                && bidder1_hours > bidder2_hours) {
            System.out.printf(bidder2 + " is the winner with an hour count of &4.2f", bidder2_hours);
        }
        if (bidder1_cost == bidder2_cost
                && bidder1_hours == bidder2_hours) {
            System.out.printf(bidder2 + " and " + bidder1 + " have identical bids with a time of " + bidder1_hours + ", an hourly rate of $%4.2f, and a total cost of $%4.2f", bidder1_charge, bidder1_cost);
        }

    }

}
