

public class Population
{
    public static void main(String[] args)
    {
        int year = 0;
        double mexicoPop = 128, statesPop = 323;
        while(mexicoPop < statesPop)
        {
            mexicoPop += mexicoPop * 1.01;
            statesPop -= statesPop * 0.15;
            year += 1;
            System.out.println("\nMexico population = " + mexicoPop);
            System.out.println("United States population = " + statesPop);
        }
        System.out.println("\nThe Number of Years it took :  " + year );
    }
}