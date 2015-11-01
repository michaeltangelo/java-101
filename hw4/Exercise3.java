// (Average an array) Write two overloaded methods that return the average of an array with the 
// following headers:

// public static int average(int[] array) 
// public static double average(double[] array)

// Write a test program that prompts the user to enter ten double values, invokes this method, 
// and displays the average value.

import java.util.Scanner;

public class Exercise3 {

	// finds average of all elements in an int array
	public static int average(int[] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total/array.length;
	}

	// finds average of all elements in a double array
	public static double average(double[] array) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total/array.length;
	}

	public static void main(String[] args) {
		// declaring and initializing scanner
		Scanner sc = new Scanner(System.in);
		
		// declaring double array - initializing with 10 elements
		double[] arr = new double[10];
		
		// filling array with user input
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Enter number %d:\n", i+1);
			arr[i] = sc.nextDouble();
		}
		
		// output
		System.out.printf("\nThe average value (rounded to 2 decimals) is: %.2f\n", average(arr));

		// closing scanner
		sc.close();
	}

}