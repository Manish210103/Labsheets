

public class Harmonicsum
{
    public static void main(String[] arg)
    {
        double sumL = 1, sumR = 1;
        System.out.print("\nSum of harmonic series from left to right : ");

        for(int i = 2;i < 50001;i++)
        {
            sumL += 1.0/i;
        }
        System.out.println(sumL);
        System.out.print("\nSum of harmonic series from right to left : ");
        for(int i = 50000;i > 1;i--)
        {
            sumR += 1.0/i;
        }
        System.out.println(sumR);
        System.out.println("\nAbsolute difference  = " + Math.abs(sumR - sumL) );
    }
}