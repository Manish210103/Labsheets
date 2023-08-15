public class FibonacciNumbers {
    public static void main(String[] args) {
        int n = 20;
        int[] fibonacci = new int[n];

        fibonacci[0] = 1; // F(1)
        fibonacci[1] = 1; // F(2)

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("Fibonacci Series");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
            sum += fibonacci[i];
        }

        double average = (double) sum / n;

        System.out.println("\nAverage: " + average);
    }
}
