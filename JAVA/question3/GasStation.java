import java.util.Scanner;
class GasStation
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int i, n;
        System.out.print("Enter the number of gas stations:");
        n=input.nextInt();
        int[] gas=new int[n];
        int[] cost=new int[n];
        System.out.print("Enter the gas array:");
        for(i=0;i<n;i++)
        {
            gas[i]=input.nextInt();
        }
        System.out.print("Enter the cost array:");
        for(i=0;i<n;i++)
        {
            cost[i]=input.nextInt();
        }
        int tot_gas=0;
        int tot_cost=0;
        int curr_gas=0;
        int starting_pt=0;
        for(i=0;i<n;i++)
        {
            tot_gas=tot_gas+gas[i];
            tot_cost=tot_cost+cost[i];
            curr_gas=curr_gas+gas[i]-cost[i];
            if(curr_gas<0)
            {
                starting_pt=i+1;
                curr_gas=0;
            }
        }
        if(tot_cost>tot_gas)
        {
            System.out.println("Not possible!");
        }
        else
        {
            System.out.println("Starting point: "+starting_pt);
        }
    }
}