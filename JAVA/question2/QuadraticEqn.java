import java.util.Scanner;

public class QuadraticEqn
{
    public static void main(String[] args)
    {
        double a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.println("\n Quadratic equation form ax^2 + bx + c = 0 ");
        System.out.print("Enter a : ");
        a = in.nextDouble();
        System.out.print("Enter b : ");
        b = in.nextDouble();
        System.out.print("Enter c : ");
        c = in.nextDouble();
        double disc = b*b - 4*a*c;

        if(disc == 0)
        {
            System.out.println( String.format("\nSame roots = %.3f\n", -b /(2*a)) );
        }
        else if(disc > 0)
        {
            System.out.println( String.format("\nRoots are r1 = %.3f, r2 = %.3f\n", ((-b +Math.sqrt(disc)) / (2*a)),((-b - Math.sqrt(disc)) / (2*a)) ) );
        }
        else
        {
            System.out.println("\nImaginary roots.\n");
        }
        in.close();
    }
}