/*
    7.  The Huntington High School basketball team has five players named Art, Bob, Cal, Dan, and
        Eli. Accept the number of points scored by each player in a game and create a bar chart that
        illustrates the points scored by displaying an asterisk for each point. The output looks similar
        to the chart in shown in below figure.
 */

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        String[] names = new String[] { "Art", "Bob", "Cal", "Dan", "Eli" };
        int []arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.print("\nEnter Points earned by "+ names[i]+" :");
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nPoints for Game \n");

        for(int i=0;i<5;i++)
        {
            System.out.print(names[i]+"   ");
            for(int j=0;j<arr[i];j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }

    
}
