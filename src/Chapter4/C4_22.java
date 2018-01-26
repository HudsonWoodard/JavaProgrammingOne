package Chapter4;

import java.util.Scanner;

/**
 * Program to display whether a string is or is not a substring of another
 *
 * @author Hudson Woodard
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string1 = input.next();
        System.out.println("Enter Another String: ");
        String string2 = input.next();
        if (string1.contains(string2)) {
            System.out.println("The second string is a substring of the first.");
        } else {
            System.out.println("The second string is not a substring of the first.");
        }
    }
}
