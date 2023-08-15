import java.util.Scanner;
class Staircase
{
    public static void main(String[] args)
    {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter number of steps  : ");
        n = in.nextInt();
        in.close();
        if(n == 1) System.out.println("\nNumber of ways : " + 1 + "\n");
        else
        {
            int val = 0, num1 = 1, num2 = 1;
            for(int i = 0;i < n - 1;i++)
            {
                val = num1 + num2;
                num1 = num1 + num2;
                num2 = num1 - num2;
                num1 = num1 - num2;
                num2 = num1 + num2; 
            }
            System.out.println("\nNumber of ways : " + val + "\n");
        }
    }
}