/*
        8.  Given an array nums with n objects colored red, white, or blue, sort them in-place so that
            objects of the same color are adjacent, with the colors in the order red, white, and blue. Use
            the integers 0, 1, and 2 to represent the color red, white, and blue, respectively. You must solve
            this problem without using the library's sort function.
 */

import java.util.Scanner;

public class ColorSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of val : ");
        int val = scanner.nextInt();
        int []arr = new int[val];
        int temp;
        System.out.println("Enter the values : ");
        for(int i=0;i<val;i++)
        {
            arr[i] = scanner.nextInt();
        }


        for(int i=0;i<val;i++)
        {
            for(int j=0;j<val;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }


        System.out.println("The Sorted array : ");
        for(int i=0;i<val;i++)
        {
            System.out.print(arr[i]);
        }
    }
    
}
