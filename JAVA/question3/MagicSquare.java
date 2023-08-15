/*
    13. Check whether the user given array elements form a magic square or not? A magic square is
        an arrangement of the numbers from 1 to n^2 (n-squared) in an nxn matrix, with each number
        occurring exactly once, and such that the sum of the entries of any row, any column, or any
        main diagonal is the same. It is not hard to show that this sum must be n(n^2+1)/2.
 */

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        // Calculate the sum that each row, column, and diagonal should have
        int expectedSum = n * (n * n + 1) / 2;

        // Check the sum of each row
        for (int[] row : matrix) {
            int rowSum = 0;
            for (int num : row) {
                rowSum += num;
            }
            if (rowSum != expectedSum) {
                System.out.println("The given matrix does not form a magic square.");
                return;
            }
        }

        // Check the sum of each column
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != expectedSum) {
                System.out.println("The given matrix does not form a magic square.");
                return;
            }
        }

        // Check the sum of the main diagonal (top-left to bottom-right)
        int mainDiagSum = 0;
        for (int i = 0; i < n; i++) {
            mainDiagSum += matrix[i][i];
        }
        if (mainDiagSum != expectedSum) {
            System.out.println("The given matrix does not form a magic square.");
            return;
        }

        // Check the sum of the anti-diagonal (top-right to bottom-left)
        int antiDiagSum = 0;
        for (int i = 0; i < n; i++) {
            antiDiagSum += matrix[i][n - 1 - i];
        }
        if (antiDiagSum != expectedSum) {
            System.out.println("The given matrix does not form a magic square.");
            return;
        }

        System.out.println("The given matrix forms a magic square.");
        
    }
    
}
