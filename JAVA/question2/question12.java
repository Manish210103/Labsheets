import java.util.Scanner;

public class question12
        {
        public static void main(String[] args)

        {
        int minutes, text, data;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter number of minutes to talk : ");
        minutes = scanner.nextInt();
        System.out.print("\nEnter number of text messages : ");
        text = scanner.nextInt();
        System.out.print("\nEnter number of GB of data needed : ");
        data = scanner.nextInt();
        if(minutes < 500)
        {
            if(text == 0 && data == 0)
                System.out.println("\nPlan A with $49 per month.\n");
            if(text > 0)
                System.out.println("\nPlan B with $55 per month.\n");
            if(data < 4)
                System.out.println("\nPlan E with $79 per month.\n");
            else if(data > 2)
                System.out.println("\nPlan F with $87 per month.\n");
        }
        else if(minutes > 499)
        {
            if(data == 0 && text < 101)
                System.out.println("\nPlan C with $61 per month.\n");
            else if(data == 0 && text > 99)
                System.out.println("\nPlan D with $70 per month.\n");
            if(data < 4)
                System.out.println("\nPlan E with $79 per month.\n");
            else if(data > 2)
                System.out.println("\nPlan F with $87 per month.\n");

        }
        scanner.close();
        }
            
}
