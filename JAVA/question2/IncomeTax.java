import java.util.Scanner;
class IncomeTax
{
    public static void main(String [] args)
    {
        double taxableIncome, tax = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter taxable income : ");
        taxableIncome = in.nextDouble();
        while(taxableIncome < 0)
        {
            System.out.print("\nEnter proper amount : ");
            taxableIncome = in.nextDouble();
        }
        in.close();

        if(taxableIncome<20001)
        {}
        else if(taxableIncome<40001)
        {
            tax+=(taxableIncome-20000)*10/100;
        }
        else if(taxableIncome<60001)
        {
            tax+=20000*10/100+(taxableIncome-40000)*20/100;
        }
        else
        {
            tax+=20000*10/100+20000*20/100+(taxableIncome-60000)*30/100;
        }
        System.out.printf("\nPayable tax = %.2f\n\n", tax);
    }
}