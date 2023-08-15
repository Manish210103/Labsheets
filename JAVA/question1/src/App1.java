
/*
    2. Write a program that converts distances measured in kilometers to miles. One kilometer is
       approximately 0.62 miles.
 */

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Distance in km : ");
        double distance = scanner.nextDouble();

        double miles = distance*0.62;

        // Display the converted temperature in Celsius
        System.out.println("distance in miles : " + miles);

        scanner.close();
    }
}
