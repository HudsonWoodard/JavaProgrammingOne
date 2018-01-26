package Chapter6;

import java.util.Scanner;

/**
 * Program to display whether the password the user inputted is valid or invalid
 *
 * @author Hudson Woodard
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        System.out.print("Enter your password: ");
        password = input.nextLine();
        if (checkPassword(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

    /**
     * Method to determine if the inputted meets the required standards
     *
     * @param password The user inputted password that will be evaluated by the
     * @return method return false/true
     */
    public static boolean checkPassword(String password) {
        int counter = 0;
        // Must have at least 8 characters
        if (password.length() < 8) {
            System.out.println("A password must have at least eight characters");
            return false;
        }
        //Must consist of only letters or numbers
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                System.out.println("A password must consist of only letters and digits");
                return false;
            }
        }
        //Must contain at least two digits
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                ++counter;
            }
        }
        if (counter < 2) {
            System.out.println("A password must contain at least two digits");
            return false;
        }
        return true;
    }

}
