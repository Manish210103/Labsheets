/*
    12. Five Bikers Compete in a race such that they drive at a constant speed which may or may not
        be the same as the other. To qualify the race, the speed of a racer must be more than the average
        speed of all 5 racers. Take as input the speed of each racer and print back the speed of
        qualifying racers
 */

import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array to store the speeds of the racers
        double[] speeds = new double[5];

        // Input the speeds of each racer
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the speed of racer " + (i + 1) + ": ");
            speeds[i] = scanner.nextDouble();
        }
        // Calculate the average speed of all racers
        double sum = 0;
        for (double speed : speeds) {
            sum += speed;
        }
        double averageSpeed = sum / speeds.length;
        // Print the speeds of the qualifying racers
        System.out.println("Qualifying racers:");
        for (double speed : speeds) {
            if (speed > averageSpeed) {
                System.out.println(speed);
            }
        }
        scanner.close();
    }
}
