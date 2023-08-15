



import java.util.Scanner;

public class App15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total miles driven per day: ");
        double totalMilesDriven = scanner.nextDouble();
        System.out.print("Enter the cost per gallon of gasoline: ");
        double costPerGallon = scanner.nextDouble();
        System.out.print("Enter the average miles per gallon: ");
        double averageMilesPerGallon = scanner.nextDouble();
        System.out.print("Enter the parking fees per day: ");
        double parkingFeesPerDay = scanner.nextDouble();
        System.out.print("Enter the tolls per day: ");
        double tollsPerDay = scanner.nextDouble();
        double gasCost = (totalMilesDriven / averageMilesPerGallon) * costPerGallon;
        double totalCost = gasCost + parkingFeesPerDay + tollsPerDay;
        System.out.println("Your cost per day of driving to work: $" + totalCost);
        scanner.close();
    }
}
