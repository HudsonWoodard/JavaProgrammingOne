
package Chapter7;

import java.util.Scanner;
/**
 * Program to display the smallest number out of a list of numbers entered in by the user
 *
 *
 * @author Hudson Woodard
 */

public class C7_7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Entering numbers and filling array
        double[] myList = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }
        //Output
        System.out.println("The minimum number is " + min(myList));
    }

    //Finding the minimum
    /**
     * 
     * @param myList the array previously entered in by the user
     * @return min the minimum number in the array  
     */
    public static double min(double[] myList) {
        double min = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] < min) {
                min = myList[i];
            }
        }
        return min;
    }

}
