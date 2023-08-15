import java.util.Scanner;

class  MatrixMenu
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int m,n;
		System.out.print("Enter the number of rows:");
		m=input.nextInt();
		System.out.print("Enter the number of columns:");
		n=input.nextInt();
		int i,j;
		int[][] matrix=new int[m][n];
		int[][] transpose=new int[n][m];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.format("Enter element [%d][%d]:",i,j);
				matrix[i][j]=input.nextInt();
			}
		}

		int choice;
		do
		{
			System.out.format("\n\nOptions:");
			System.out.format("\n\t1-> Display matrix:");
			System.out.format("\n\t2-> Sum of all elements:");
			System.out.format("\n\t3-> Row-wise sum:");
			System.out.format("\n\t4-> Column-wise sum:");
			System.out.format("\n\t5-> Transpose:");
			System.out.format("\n\t6-> Exit:");
			System.out.println("\nEnter your choice:");
			choice=input.nextInt();
			//displaying the matrix
			if(choice==1)
			{
				for(i=0;i<m;i++)
				{
					for(j=0;j<n;j++)
					{
						System.out.format(" %d ",matrix[i][j]);
					}
					System.out.println();
				}
				System.out.println();
			}

			//sum of all elements
			else if(choice==2)
			{
				int sum=0;
				for(i=0;i<m;i++)
				{
					for(j=0;j<n;j++)
					{
						sum=sum+matrix[i][j];
					}
				}
				System.out.format("Sum: %d\n",sum);

			}
			//Row wise sum
			else if(choice==3)
			{
				for(i=0;i<m;i++)
				{
					int sum=0;
					for(j=0;j<n;j++)
					{
						sum=sum+matrix[i][j];
					}
				System.out.format("Sum of Row %d : %d\n",i+1,sum);
				}
			}

			//Column wise sum

			else if(choice==4)
			{
				for(j=0;j<n;j++)
				{
					int sum=0;
					for(i=0;i<m;i++)
					{
						sum=sum+matrix[i][j];
					}
					System.out.format("Sum of Column %d : %d\n",j+1,sum);
				}
			}

			else if(choice==5)
                        {
				int ti=0;
				int tj=0;
                                for(j=0;j<n;j++)
                                {
					tj=0;
                                        //System.out.print("J");
					for(i=0;i<m;i++)
                                        {
						//System.out.println("Inside");
                                                transpose[ti][tj]=matrix[i][j];
						System.out.format(" %d ",transpose[ti][tj]);
						tj++;
                                        }
					System.out.println();
					ti++;
                                }
                        }

		}while(choice!=6);
	}
}
