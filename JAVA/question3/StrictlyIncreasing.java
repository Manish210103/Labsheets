/*
    14. Write a program to remove one element to make the array strictly increasing, return true if it
        can be made strictly increasing after removing exactly one element, or false otherwise. If the
        array is already strictly increasing, return true.
 */

import java.util.Scanner;

public class StrictlyIncreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array :  ");
        int n = scanner.nextInt();

        int [] arr= new int[n];
        int [] arr_new = new int[arr.length - 1];
        int count=0;
        int temp=n-1;

        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }

        for(int i=0;i<n-1;i++)
        {
            if (arr[i]>arr[i+1])
            {
                count+=1;
                temp=Math.min(temp,i);
            }
        }
        if (count==1)
        {
            int a=0;
            for (int i = 0, k = 0; i < arr.length; i++) {
                if (i != temp) 
                {
                    arr_new[k] = arr[i];
                    k++;
                    a++;
                }
            }
            System.out.print("\ntrue");
        }
        else if(count==0)
        {
            System.out.print("\ntrue");
        }
        else{
        System.out.print("\nfalse");
        }
    }
}
