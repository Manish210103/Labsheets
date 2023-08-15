/*
        19. Write a program that reads in investment amount, annual interest rate, and number of years,
            and displays the future investment value using the following formula:
 */


import java.util.Scanner;

public class App19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the investment amount
        System.out.print("Enter the investment amount: ");
        double investmentAmount = scanner.nextDouble();

        // Prompt the user to enter the annual interest rate
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        // Prompt the user to enter the number of years
        System.out.print("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();

        // Convert the annual interest rate from percentage to decimal
        double monthlyInterestRate = annualInterestRate / 12 / 100;

        // Calculate the future investment value
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        // Display the future investment value
        System.out.println("Future Investment Value: " + futureValue);
        scanner.close();
    }
}
