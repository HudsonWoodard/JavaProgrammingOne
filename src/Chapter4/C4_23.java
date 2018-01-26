package Chapter4;

import java.util.Scanner;

/**
 * Program to display the name, hours worked, payrate, deductions, and net pay
 * of an employee
 *
 * @author Hudson Woodard
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the employee: ");
        String employee = input.next();
        System.out.println("How many hours do they work in a week?");
        double hours = input.nextDouble();
        System.out.println("What is their hourly payrate?");
        double payrate = input.nextDouble();
        System.out.println("What is the federal tax withholding rate? ");
        double fedtax = input.nextDouble(); // fedtax is the federal tax withholding rate
        System.out.println("What is the state tax withholding rate? ");
        double statetax = input.nextDouble();
        double grosspay = (payrate * hours);
        double fed_deduction = (grosspay * fedtax);
        double state_deduction = (grosspay * statetax);
        double total_deduction = (fed_deduction + state_deduction);
        double netpay = (grosspay - total_deduction);
        System.out.println("Employee Name:" + employee);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Payrate: " + payrate);
        System.out.println("Deductions:");
        System.out.printf("Federal Withholdings: $%4.2f" + "%n", fed_deduction);
        System.out.printf("State Withholdings: $%4.2f" + "%n", state_deduction);
        System.out.printf("Total Deduction: $%4.2f" + "%n", total_deduction);
        System.out.printf("Net Pay: $%4.2f" + "%n", netpay);

    }
}
