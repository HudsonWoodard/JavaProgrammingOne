package Chapter5;

import java.util.Scanner;

/**
 * Program to play rock paper scissors with the users
 *
 * @author Hudson Woodard
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Initializing scanner and variables
        Scanner scan = new Scanner(System.in);
        int computerChoice;
        int playerInput;
        int playerLoss = 0;
        int playerWin = 0;

        //Begining game
        while (playerLoss <= 1 && playerWin <= 1) {
            System.out.print("\n\nRock, 1, Paper, 2, or Scissors, 3?");
            playerInput = scan.nextInt();
            computerChoice = (int) (Math.random() * 3);
            computerChoice += 1;

            if (playerInput >= 4) {
                System.out.println("\nInvalid input, try again.");
                continue;
            }

            switch (playerInput) {
                case 1:
                    switch (computerChoice) {
                        case 1:
                            System.out.print("It's a tie");
                            break;
                        case 2:
                            System.out.print("You lost");
                            playerLoss += 1;
                            break;
                        case 3:
                            System.out.print("You win!");
                            playerWin += 1;
                            break;
                    }
                    break;
                case 2:
                    switch (computerChoice) {
                        case 1:
                            System.out.print("You win!");
                            playerWin += 1;
                            break;
                        case 2:
                            System.out.print("It's a tie!");
                            break;
                        case 3:
                            System.out.print("You lost");
                            playerLoss += 1;
                            break;
                    }
                    break;
                case 3:
                    switch (computerChoice) {
                        case 1:
                            System.out.print("You lost");
                            playerLoss += 1;
                            break;
                        case 2:
                            System.out.print("You Win!");
                            playerWin += 1;
                            break;
                        case 3:
                            System.out.print("It's a tie!");
                            break;
                    }
                    break;
            }
        }

        if (playerLoss > playerWin) {
            System.out.println(" 2/3");
        } else if (playerWin > playerLoss) {
            System.out.println(" 2/3!");
        }
    }
}
