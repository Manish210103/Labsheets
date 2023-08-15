import java.util.Scanner;

public class BloodPressure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter patient ID#: ");
            int patientId = scanner.nextInt();

            if (patientId == -1) {
                break; // 
            }

            System.out.print("Enter number of readings: ");
            int numReadings = scanner.nextInt();

            int sum = 0;
            for (int i = 0; i < numReadings; i++) {
                System.out.print("Enter reading " + (i + 1) + ": ");
                int reading = scanner.nextInt();
                sum += reading;
            }

            double average = (double) sum / numReadings;
            System.out.printf("For patient ID#: %d average BP = %.2f\n", patientId, average);
        }

        scanner.close();
    }
}
