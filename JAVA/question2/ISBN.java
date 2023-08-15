import java.util.Scanner;
class ISBN
{
        public static void main(String[] args)
        {
            int Isbn[] = new int[10];
            int checkSum;
            Scanner in = new Scanner(System.in);
            System.out.println("\nEnter 9 digits of an ISBN number to calculate the checksum(10th digit) :");

            for(int i = 0;i < 9;i++)
            {
                System.out.print("\nEnter digit " + (i + 1) + " of ISBN number : ");
                Isbn[i] = in.nextInt();
            }

            checkSum = (Isbn[0] * 1 + Isbn[1] * 2 + Isbn[2] * 3 + Isbn[3] * 4 + Isbn[4] * 5 +

            Isbn[5] * 6 + Isbn[6] * 7 + Isbn[7] * 8 +
            Isbn[8] * 9) % 11;

            System.out.println("\nISBN number :\n");
            for(int i = 0;i < 9;i++)
            {
                System.out.print(Isbn[i]);
            }
            if(checkSum == 10)
                System.out.println("X\n");
            else
                System.out.println(checkSum + "\n");
            in.close();
        }
}