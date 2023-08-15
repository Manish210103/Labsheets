import java.util.Scanner;

class Bulbs
{
    public static void main(String[] args)
    {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the number of bulbs : ");
        n = in.nextInt();
        in.close();
        System.out.println("\nNumber of bulbs ON after " + n + " rounds = " + (int)Math.sqrt(n));
    }
}