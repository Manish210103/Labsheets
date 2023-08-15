public class Factorial
{
    public static void main(String args[])
    {
        int fact = 1;
        for(int i = 2;i < 12;i++)
        {
            System.out.print("\nFactorial of " + (i - 1) + " : " + fact);
            fact *= i;
        }
        System.out.println();
    }
}