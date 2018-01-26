package Chapter4;

import java.util.Scanner;

/**
 * Program to display the grade and major of a college student
 *
 * @author Hudson Woodard
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a major: ");
        String major = input.next();
        System.out.println("Enter a grade level: ");
        int grade = input.nextInt();
        String m = "M";
        if ((!major.equalsIgnoreCase("m") && !major.equalsIgnoreCase("i")
                && !major.equalsIgnoreCase("c"))
                || (grade != 1 && grade != 2 && grade != 3 && grade != 4)) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        if (major.equalsIgnoreCase("m")) {
            System.out.print("Mathematics");
        } else if (major.equalsIgnoreCase("i")) {
            System.out.print("Information Techonology");
        } else if (major.equalsIgnoreCase("c")) {
            System.out.print("Computer Science");
        }
        if (grade == 1) {
            System.out.print(" Freshman");
        } else if (grade == 2) {
            System.out.print(" Sophomore");
        } else if (grade == 3) {
            System.out.print(" Junior");
        } else if (grade == 4) {
            System.out.print(" Senior");
        }
    }
}
