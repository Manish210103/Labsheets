/*
    4. Write a program to calculate the volume and surface area of a sphere from its radius, given as
       input.
 */

import java.util.Scanner;

public class App3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        Double radius = scanner.nextDouble();

        Double volume = (4.0/3)*(3.14*Math.pow(radius, 2));

        Double Surface_area = 4*3.14*Math.pow(radius, 2);

        System.out.println("The Volume : " + volume);
        System.out.println("The Surface area : " + Surface_area);

        scanner.close();



    }
    
}
