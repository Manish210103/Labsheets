/*
    9.  Write a program that determines the molecular weight of a hydrocarbon based on the number
    of hydrogen, carbon, and oxygen atoms. You should use the following weights:
 */

import java.util.Scanner;

public class App8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of hydrogen : ");
        Integer hydrogen = scanner.nextInt();

        System.out.println("Enter number of Carbon : ");
        Integer carbon = scanner.nextInt();

        System.out.println("Enter number of Oxygen : ");
        Integer oxygen = scanner.nextInt();

        System.out.println("The molecular weight is  :  " + ((hydrogen*1.0079)+(carbon*12.011)+(oxygen*15.9994)));

        scanner.close();
    }
}
