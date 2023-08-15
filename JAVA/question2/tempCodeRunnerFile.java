import java.util.Scanner;

public class PensionCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for contribution rates and salary ceiling
        final double[] employeeRates = {20.0, 13.0, 7.5, 5.0};
        final double[] employerRates = {17.0, 13.0, 9.0, 7.5};
        final double salaryCeiling = 6000.0;

        // Prompt for monthly salary
        System.out.print("Enter the monthly salary: $");
        double salary = scanner.nextDouble();

        // Prompt for age
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        // Find the contribution rates based on age
        double employeeRate;
        double employerRate;

        if (age <= 55) {
            employeeRate = employeeRates[0];
            employerRate = employerRates[0];
        } else if (age <= 60) {
            employeeRate = employeeRates[1];
            employerRate = employerRates[1];
        } else if (age <= 65) {
            employeeRate = employeeRates[2];
            employerRate = employerRates[2];
        } else {
            employeeRate = employeeRates[3];
            employerRate = employerRates[3];
        }

        // Calculate contributions
        double employeeContribution;
        double employerContribution;
        double totalContribution;

        if (salary <= salaryCeiling) {
            employeeContribution = salary * employeeRate / 100.0;
            employerContribution = salary * employerRate / 100.0;
        } else {
            employeeContribution = salaryCeiling * employeeRate / 100.0;
            employerContribution = salaryCeiling * employerRate / 100.0;
        }

        totalContribution = employeeContribution + employerContribution;

        // Display contribution details rounded to 2 decimal places
        System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);
        System.out.printf("The total contribution is: $%.2f%n", totalContribution);
    }
}
