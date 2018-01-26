package Chapter7;

import java.util.Scanner;

/**
 * Program to tell the user if two arrays are identical or not
 *
 *
 * @author Hudson Woodard
 */

public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Entering numbers and filling arrays
        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        //Output
        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }
    }

//Checking whether identical or not
    /**
     * Method to tell whether the two lists are the same or not
     * @param list1 an array previously entered in by the user
     * @param list2 an array previously entered in by the user
     * @return true/false if the two arrays are equal
     */
    public static boolean equals(int[] list1, int[] list2) {
        return java.util.Arrays.equals(list1, list2);
    }

}
