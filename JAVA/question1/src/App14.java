import java.util.Scanner;

public class App14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the current world population
        System.out.print("Enter the current world population: ");
        long currentPopulation = scanner.nextLong();

        // Prompt the user to enter the annual world population growth rate
        System.out.print("Enter the annual world population growth rate (in decimal form): ");
        double growthRate = scanner.nextDouble();

        // Calculate the estimated world population after one, two, three, four, and five years
        long populationAfterOneYear = (long) (currentPopulation * (1 + growthRate));
        long populationAfterTwoYears = (long) (populationAfterOneYear * (1 + growthRate));
        long populationAfterThreeYears = (long) (populationAfterTwoYears * (1 + growthRate));
        long populationAfterFourYears = (long) (populationAfterThreeYears * (1 + growthRate));
        long populationAfterFiveYears = (long) (populationAfterFourYears * (1 + growthRate));

        // Display the estimated world population after each year
        System.out.println("Estimated world population after one year: " + populationAfterOneYear);
        System.out.println("Estimated world population after two years: " + populationAfterTwoYears);
        System.out.println("Estimated world population after three years: " + populationAfterThreeYears);
        System.out.println("Estimated world population after four years: " + populationAfterFourYears);
        System.out.println("Estimated world population after five years: " + populationAfterFiveYears);
        scanner.close();
    }
}
