public class SumAndAverage {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
    }
}
