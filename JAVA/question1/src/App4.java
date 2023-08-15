/*
    5.Write a program that calculates the cost per square inch of a circular pizza, given its diameter
      and price.
 */

import java.util.Scanner;

public class App4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the diameter : ");
        Double diameter = scanner.nextDouble();

        System.out.print("Enter the Price : ");
        Double price = scanner.nextDouble();

        Double area = 3.14*Math.pow(diameter, 2);
        Double cost = area/price;

        System.out.println("The price per inch : " + cost);

        scanner.close();
    }
    
}
