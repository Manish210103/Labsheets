/*
    6.  Write a program that determines the distance to a lightning strike based on the time elapsed
        between the flash and the sound of thunder. The speed of sound is approximately 1100 ft/sec
        and 1 mile is 5280 ft.
 */
import java.util.Scanner;

public class App5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time in sec : ");

        Integer time = scanner.nextInt();

        Double distance = (double) (time*1100);

        System.out.println("The distance in miles : " + distance/5180);

        scanner.close();
        
    }
    
}
