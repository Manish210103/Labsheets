/*
    3.Develop a program to calculate Simple Interest & Compound Interest.
 */


import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt the user to enter the interest rate
        System.out.print("Enter the annual interest rate (in percentage): ");
        double interestRate = scanner.nextDouble();

        // Prompt the user to enter the time period in years
        System.out.print("Enter the time period in years: ");
        double timePeriod = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * interestRate * timePeriod) / 100;

        // Calculate compound interest
        double compoundInterest = principal * Math.pow((1 + (interestRate / 100)), timePeriod) - principal;

        // Display the calculated interests
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
        scanner.close();
    }
}

