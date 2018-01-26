package Chapter5;

import java.util.Scanner;

/**
 * Program to display how may yes and no votes were inputted into the keyboard
 *
 * @author Hudson Woodard
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        long yes = 0;
        long no = 0;
        char userInput;
        boolean keepVoting = true;
        Scanner scan = new Scanner(System.in);

        while (keepVoting == true) {
            System.out.println("\nType your vote. Y mean yes, N means no, and when you want to end the vote, type Q. ");
            userInput = scan.next().charAt(0);

            userInput = Character.toUpperCase(userInput);
            // I thought I might try a switch statement this time :)
            switch (userInput) {
                case 'Y':
                    yes += 1;
                    break;
                case 'N':
                    no += 1;
                    break;
                case 'Q':
                    keepVoting = false;
                    break;
                default:
                    System.out.print("INVALID INPUT:");
                    break;
            }
        }

        System.out.print("\n\nVote Total: ");
        System.out.print("\n   Yes Votes: " + yes);
        System.out.print("\n   No Votes: " + no);

        if (yes > no) {
            System.out.print("\n There were more yes votes than no votes");
        } else if (yes < no) {
            System.out.print("\n There were more no voites than yes votes");
        } else {
            System.out.print("\n The amount of yes votes and no votes were the same");
        }
    }

}
