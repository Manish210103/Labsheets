/*
    11. The Gregorian epact is the number of days between January 1st and the previous new moon.
        This value is used to figure out the date of Easter. It is calculated by these formulas (using int
        arithmetic):

        Write a program that prompts the user for a 4-digit year and then outputs the value of the epact.
 */

 import java.util.Scanner;

public class App10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Year : ");
        Integer year = scanner.nextInt();
        if (year > 999 && year < 10000){
            Double C = (double) (year/100);
            Double epact = (8 + (C/4) - C + (8*C + 13) / 25) + 11*(year % 19) % 30;
            System.out.println("The epact : " + epact);

            scanner.close();
        }

    }
    
}
