/*
    15. You are given an array prices where prices[i] is the price of a given stock on the ith day. You
        want to maximize your profit by choosing a single day to buy one stock and choosing a
        different day in the future to sell that stock. Return the maximum profit you can achieve from
        this transaction. If you cannot achieve any profit, return 0.
        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before
        you sell.
 */

import java.util.Scanner;

public class MaxProfit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values : ");
        int num = scanner.nextInt();
        int [] arr = new int[num];

        for(int i=0;i<num;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int temp = arr[0];
        int m=0;
        int c=0;

        for(int i=1;i<num;i++)
        {
            temp=Math.min(temp,arr[i]);
            if(arr[i]<arr[i-1])
            {
                c+=1;
            }
            else
            {
                int diff = arr[i]-temp;
                m=Math.max(m,diff);
            }
        }
        if (c==arr.length)
        {
            System.out.println("The max Prfit is : "+0);
        }
        else
        {
            System.out.println("The max Profit is : "+m);
        }


        
    }
}
