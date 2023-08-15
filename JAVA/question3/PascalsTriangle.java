import java.util.Scanner;
class PascalsTriangle
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int row;
		System.out.print("Enter number of rows:");
		row=input.nextInt();
		int i,j;
		int[][] triangle=new int[row][];
		for(i=0;i<row;i++)
		{
			triangle[i]=new int[i+1];
			triangle[i][0]=1;
			triangle[i][i]=1;
			for(j=1;j<i;j++)
			{
				triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
			}
		}
		for(int r=0;r<triangle.length;r++)
		{
			for(int c=0;c<triangle[r].length;c++)
			{
				System.out.print(triangle[r][c]+" ");
			}
			System.out.println();
		}
		for(i=0;i<row;i++)
                {
                        System.out.print("[");
                        for(j=0;j<=i;j++)
                        {
                                System.out.format(" %d ",triangle[i][j]);
                        }
                        System.out.print("]");
                }

	}
}
