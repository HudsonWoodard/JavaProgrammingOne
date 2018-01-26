package Chapter3;

import java.util.Scanner;

/**
 * Program to display whether the user has guessed a number correctly
 *
 * @author Hudson Woodard
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = (int) (Math.random() * 1.99);
        System.out.println("What's your guess? ");
        double guess = input.nextDouble();
        if (guess == result) {
            System.out.println("You got it right!");
        }
        if (guess != result) {
            System.out.println("Sorry, you got it wrong. Try again! ");
        }
    }
}
