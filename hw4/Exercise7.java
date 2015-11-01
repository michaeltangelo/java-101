// (Sum the major diagonal in a matrix) Write a method that sums all the numbers in the major 
// diagonal in an n * n matrix of double values using the following header:

// public static double sumMajorDiagonal(double[][] m)

// Write a test program that reads a 4-by-4 matrix and displays the sum of all its
// elements on the major diagonal. Here is a sample run:

// Enter a 4-by-4 matrix row by row:
// 1 2 3 4.0
// 5 6.5 7 8
// 9 10 11 12
// 13 14 15 16
// Sum of the elements in the major diagonal is 34.5

import java.util.Scanner; 

public class Exercise7 {
	// printGrid function used for reference from - http://stackoverflow.com/questions/7782080/java-printing-two-dimensional-array
	public static void printGrid(double[][] a, int row, int col)
	{
	   for(int i = 0; i < row; i++)
	   {
	      for(int j = 0; j < col; j++)
	      {
	         System.out.printf("%.2f ", a[i][j]);
	      }
	      System.out.println();
	   }
	}
	
	// sumMajorDiagonal function
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m[0].length; i++) {
			sum += m[i][i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// declaring and initializing scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a 4-by-4 matrix row by row:");
		
		int rows = 4;
		int columns = 4;
		
		// declaring the 2-d double array m
		double[][] m = new double[rows][columns];	
		
		// initializing 2-d double array m
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				m[row][col] = sc.nextDouble();
			}
		}
		
		//printGrid(m,4,4);
		System.out.println("The sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
		
		sc.close();
		
	}
}