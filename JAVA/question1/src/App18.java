/*
        18. How cold is it outside? The temperature alone is not enough to provide the answer. Other
        factors including wind speed, relative humidity, and sunshine play important roles in
        determining coldness outside. In 2001, the National Weather Service (NWS) implemented the
        new wind-chill temperature to measure the coldness using temperature and wind speed. The
        formula is:

        where ta is the outside temperature measured in degrees Fahrenheit and v is the speed measured
        in miles per hour. twc is the wind-chill temperature. The formula cannot be used for wind speeds
        below 2 mph or temperatures below -58 degree Fahrenheit or above 41 degree Fahrenheit.
        Write a program that prompts the user to enter a temperature between -58 degree Fahrenheit

        and 41 degree Fahrenheit and a wind speed greater than or equal to 2 and displays the wind-
        chill temperature.
 */



import java.util.Scanner;

public class App18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in degrees Fahrenheit (-58 to 41): ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the wind speed in miles per hour (>= 2): ");
        double windSpeed = scanner.nextDouble();
        if (temperature < -58 || temperature > 41 || windSpeed < 2) {
            System.out.println("Invalid input. Temperature must be between -58 and 41 Fahrenheit, and wind speed must be greater than or equal to 2 mph.");
        } else {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.println("Wind-Chill Temperature: " + windChill + " degrees Fahrenheit");
        }
        scanner.close();
    }
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
        return windChill;
        
    }
    
}

