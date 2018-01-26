package Chapter7;

import java.util.Scanner;

/**
 * Program to display the contents of an array and their average
 *
 * @author Hudson Woodard
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many numbers will be input.");
        int amount = scan.nextInt();
        double[] list = new double[amount];
        array(list, scan);
        System.out.println("Average: " + average(list));
        displayArray(list);

    }

    /**
     * Method to display the contents of the array
     *
     * @param list the array previously entered by the user
     */
    public static void displayArray(double[] list) {
        System.out.println("The contents of the array are: ");
        System.out.println(java.util.Arrays.toString(list));

    }

    /**
     * Method to prompt the user to enter in values for the array
     *
     * @param list the array previously entered by the user
     * @param input the scanner used to read the user input
     */
    public static void array(double[] list, Scanner input) {
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
    }

    /**
     * Method to find the sum of every number in the array
     *
     * @param list the array previously entered in by the user
     * @return the sum of every number in the array list
     */
    public static double average(double[] list) {
        double sum = 0;
        for (int x = 0; x < list.length; x++) {
            sum += list[x];
        }
        return (sum / list.length);
    }
}
