import java.util.Scanner;

public class AcmePartsPay {
    public static void main(String[] args) {
        // Hourly pay rates
        double firstShiftRate = 17;
        double secondShiftRate = 18.50;
        double thirdShiftRate = 22;

        // Prompt the user for input
        System.out.println("-----------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours worked: ");
        int hours = scanner.nextInt();
        System.out.println("-----------------------------------------------------------");
        System.out.print("Enter shift (1 for first shift, 2 for second shift, 3 for third shift): ");
        int shift = scanner.nextInt();
        System.out.println("-----------------------------------------------------------");
        System.out.print("Does the worker elect retirement? (1 for yes, 0 for no): ");
        int retirement = scanner.nextInt();
        

        // Calculate regular pay
        double hourlyRate;
        if (shift == 1) {
            hourlyRate = firstShiftRate;
        } else if (shift == 2) {
            hourlyRate = secondShiftRate;
        } else if (shift == 3) {
            hourlyRate = thirdShiftRate;
        } else {
            System.out.println("Invalid shift entered.");
            return;
        }

        double regularPay, overtimePay;
        if (hours <= 40) {
            regularPay = hours * hourlyRate;
            overtimePay = 0;
        } else {
            regularPay = 40 * hourlyRate;
            int overtimeHours = hours - 40;
            overtimePay = overtimeHours * hourlyRate * 1.5;
        }

        // Calculate retirement deduction
        double retirementDeduction = 0;
        if (shift == 2 || shift == 3) {
            retirementDeduction = retirement * (regularPay + overtimePay) * 0.03;
        }

        // Calculate net pay
        double netPay = (regularPay + overtimePay) - retirementDeduction;

        // Display the results
        System.out.println("-----------------------------------------------------------");
        System.out.println("Hours worked : " + hours);
        System.out.println("Shift : " + shift);
        System.out.println("Hourly pay rate : " + hourlyRate);
        System.out.println("Regular pay : " + regularPay);
        System.out.println("Overtime pay : " + overtimePay);
        System.out.println("Total pay : " + (regularPay + overtimePay));
        System.out.println("Retirement deduction : " + retirementDeduction);
        System.out.println("Net pay : " + netPay);
        System.out.println("-----------------------------------------------------------");
        scanner.close();
    }
}
