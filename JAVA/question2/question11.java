import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("\nEnter a positive integer : ");

        num = scanner.nextInt();
        System.out.print("\n * | ");
        for(int i = 1;i <= num;i++)
            System.out.print(i + " ");
            System.out.println("\n ------------------------------------------------------");
            for(int i = 1;i <= num;i++)
            {
                System.out.print(" " + i + " | ");
                for(int j = 1;j < 11;j++)
                {

                System.out.print(i*j + " ");
                }
            System.out.println();
        }
        System.out.println();

        scanner.close();
    }
    
}
