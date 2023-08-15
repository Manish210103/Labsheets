/*
    1. Write a java program to convert the temperature expressed in Fahrenheit degree into Celsius
       degree.
 */


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the converted temperature in Celsius
        System.out.println("Temperature in Celsius: " + celsius);

        scanner.close();
    }
}
