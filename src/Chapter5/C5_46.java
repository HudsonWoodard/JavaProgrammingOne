package Chapter5;

import java.util.Scanner;

/**
 * Program to display the reversed version of a string that the user inputted
 * from the keyboard
 *
 * @author Hudson Woodard
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String normalString;
        String backwardsString = "";
        char currentLetter;
        int currentIndex = 1;

        System.out.print("Insert string to reverse: ");
        normalString = scan.next();

        while (normalString.length() > backwardsString.length()) {
            currentLetter = normalString.charAt(normalString.length() - currentIndex);
            backwardsString = backwardsString + currentLetter;
            currentIndex += 1;
        }
        System.out.println("The string you entered displayed backwards is " + backwardsString);
    }

}
