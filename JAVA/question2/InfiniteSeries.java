public class InfiniteSeries {
    public static void main(String[] args) {
        double pi = 4.0;
        double denominator = 3.0;
        int index = 1;
        int term = -1;

        for (int i = 0; i < 100000; i++) {
            pi -= 4.0 / denominator;
            denominator += 2.0;
            System.out.println("Value of pi at term " + index + " = " + pi);

            if (Double.toString(pi).startsWith("3.14159") && term == -1) {
                term = index;
            }

            index++;

            pi += 4.0 / denominator;
            denominator += 2.0;
            System.out.println("Value of pi at term " + index + " = " + pi);

            if (Double.toString(pi).startsWith("3.14159") && term == -1) {
                term = index;
            }

            index++;
        }

        System.out.println("\nWe have to use " + term + " terms before we first get a value that begins with 3.14159.\n");
    }
}
