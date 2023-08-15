/*
    7.  Sammy’s Seashore Supplies rents beach equipment such as kayaks, canoes, beach chairs, and
        umbrellas to tourists. Write a program that prompts the user for the number of minutes he
        rented a piece of sports equipment. Compute the rental cost as $40 per hour plus $1 per
        additional minute. (You might have surmised already that this rate has a logical flaw, but for
        now, calculate rates as described here. You can fix the problem after you read the chapter on
        decision making.) Then display the hours, minutes, and total price.
 */
import java.util.Scanner;

public class App6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of mins : ");

        Integer minute = scanner.nextInt();

        Integer hour = minute/60;
        minute= minute%60;

        System.out.println("The total cost is : " + ((hour*40) +(minute)));
        scanner.close();
    }
    
}
