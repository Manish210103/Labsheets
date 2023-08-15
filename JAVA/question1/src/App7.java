/*
    8.  Two points in a plane are specified using the coordinates (x1, y1) and (x2, y2). Write a program
        that calculates the slope of a line through two (non-vertical) points entered by the user.
 */

import java.util.Scanner;

public class App7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinate 1 : ");
        Integer x1 = scanner.nextInt();
        Integer y1 = scanner.nextInt();

        System.out.println("Enter the coordinate 2 : ");
        Integer x2 = scanner.nextInt();
        Integer y2 = scanner.nextInt();

        Double slope = (double) ((y2-y1)/(x2-x1));

        System.out.println("The slope is : "+ slope);

        scanner.close();
    }
}
