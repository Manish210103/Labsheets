/*
    16. Suppose you save $100 each month into a savings account with the annual interest 
    rate 5%.  Thus, the monthly interest rate is After the first month, the value in the 
    account becomes 100 * (1 + 0.00417) = 100.417 
        After the second month, the value in the account becomes 
        (100 + 100.417) * (1 + 0.00417) = 201.252 
        After the third month, the value in the account becomes 
        (100 + 201.252) * (1 + 0.00417) = 302.507 and so on. 
    Write a program that prompts the user to enter a monthly saving amount and displays 
    the account value after the sixth month. 

 */

import java.util.Scanner;

public class App16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = scanner.nextDouble();  // Prompt for monthly saving amount

        double annualInterestRate = 0.05;  // Annual interest rate (5%)
        double monthlyInterestRate = annualInterestRate / 12;  // Monthly interest rate

        double accountValue = 0;  // Initialize account value

        // Calculate the account value after each month
        for (int month = 0; month < 6; month++) {
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate);
            System.out.println("The account value after the sixth month is: " + accountValue);
        }

        // Display the account value after the sixth month
        
        scanner.close();
    }
}
