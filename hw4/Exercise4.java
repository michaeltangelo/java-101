// (Find the index of the smallest element) Write a method that returns the index of the 
 // smallest element in an array of integers. If the number of such elements is greater than 1, 
// return the smallest index. Use the following header:

// public static int indexOfSmallestElement(double[] array)

// Write a test program that prompts the user to enter ten numbers, invokes this
// method to return the index of the smallest element, and displays the index.

import java.util.Scanner;

public class Exercise4 {
	
	// finds index of smallest number in a double array
	public static int indexOfSmallestElement(double[] array) {
		double current_val = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < current_val) {
				current_val = array[i];
				index = i;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		// declaring and initializing scanner
		Scanner sc = new Scanner(System.in);
		
		// creating and initializing double array with 10 elements
		double[] arr = new double[10];
		
		// filling array with user input
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Enter number %d:\n", i+1);
			arr[i] = sc.nextDouble();
		}

		// output
		System.out.printf("The index value of the smallest element is: %d\n", indexOfSmallestElement(arr));
		
		// closing scanner
		sc.close();
	}
	
}