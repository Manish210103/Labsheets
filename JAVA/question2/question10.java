import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter an integer(n) to print equilateral pyramid : ");
        int num = scanner.nextInt();

        System.out.println();
        for(int i = 0;i < num;i++)
        {
            for(int j = 0;j < num - 1 - i;j++)
                System.out.print(" ");
            for(int j = 0;j <= i;j++)
                System.out.print( (i + 1) + " ");
            System.out.println();
        }
        System.out.println();
        scanner.close();
    } 
}
