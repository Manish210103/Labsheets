/*
     10. Write a program that accepts two points (see previous problem) and determines the distance
        between them.

        Distance = √(x2 − x1)2 + (y2 − y1)2
 */

 import java.util.Scanner;

public class App9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinate 1 : ");
        Integer x1 = scanner.nextInt();
        Integer y1 = scanner.nextInt();

        System.out.println("Enter the coordinate 2 : ");
        Integer x2 = scanner.nextInt();
        Integer y2 = scanner.nextInt();

        Double distance = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));

        System.out.println("The distance : " + distance);
        scanner.close();
    }
}
