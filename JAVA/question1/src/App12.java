/*
    13. Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges $3.25 for a
        dozen eggs, or 45 cents for individual eggs that are not part of a dozen. Write a program that
        prompts a user for the number of eggs in the order and then display the amount owed with a
        full explanation. For example, typical output might be, You ordered 27 eggs. That’s 2 dozen at
        $3.25 per dozen and 3 loose eggs at 45 cents each for a total of $7.85.
 */

import java.util.Scanner;

public class App12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of eggs in the order
        System.out.print("Enter the number of eggs in the order: ");
        int totalEggs = scanner.nextInt();

        // Calculate the number of dozens and loose eggs
        int dozens = totalEggs / 12;
        int looseEggs = totalEggs % 12;

        // Calculate the total cost
        double dozenPrice = 3.25;
        double loosePrice = 0.45;
        double totalCost = (dozens * dozenPrice) + (looseEggs * loosePrice);

        // Display the amount owed with a full explanation
        System.out.println("You ordered " + totalEggs + " eggs.");
        System.out.println("That's " + dozens + " dozen at $" + dozenPrice + " per dozen");
        System.out.println("and " + looseEggs + " loose eggs at " + loosePrice + " cents each");
        System.out.println("for a total of $" + totalCost);

        scanner.close();
    }
}
