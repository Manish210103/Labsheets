import java.util.Scanner;

public class spiral {

   public static void prt(int mat[][],int n)

   {
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               System.out.print(mat[i][j]+" ");
           }
           System.out.println("");
       }
   }

   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter n value  : ");
       int n = sc.nextInt();
       int[][] mat = new int[n][n];
       int right = n - 1, left = 0;
       int top = 0,bot=n-1;
       int ct=1;

       while (ct<=n*n) {
           //top
           for (int j =left;j<=right;j++)
           {
               mat[top][j]=ct;
               ct+=1;
           }
           top+=1;
           //right
           for(int i=top;i<=bot;i++)
           {
               mat[i][right]=ct;
               ct+=1;
           }
           right-=1;
           //bottom
           for(int j=right;j>=left;j--)
           {
               mat[bot][j]=ct;
               ct+=1;
           }
           bot-=1;
           //left
           for(int i=bot;i>=top;i--)
           {
               mat[i][left]=ct;
               ct+=1;
           }
           left+=1; 
        }
        prt(mat,n);
    }
}

