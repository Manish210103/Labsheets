/*
        17. Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your
            weight in kilograms and dividing by the square of your height in meters. Write a program that
            prompts the user to enter a weight in pounds and height in inches and displays the BMI. Note
            that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 */

import java.util.Scanner;

public class App17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = scanner.nextDouble();

        // Convert weight from pounds to kilograms
        double weightKilograms = weightPounds * 0.45359237;

        // Convert height from inches to meters
        double heightMeters = heightInches * 0.0254;

        // Calculate BMI
        double bmi = weightKilograms / (heightMeters * heightMeters);

        System.out.println("BMI: " + bmi);
        scanner.close();
    }
}
