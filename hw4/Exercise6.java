// (Strictly identical arrays) The arrays list1 and list2 are strictly identical if their 
// corresponding elements are equal. Write a method that returns true if list1 and list2 are 
// strictly identical, using the following header:

// public static boolean equals(int[] list1, int[] list2)

// Write a test program that prompts the user to enter two lists of integers and dis-
// plays whether the two are strictly identical. Here are the sample runs. Note that the 
// first number in the input indicates the number of the elements in the list. 
// This number is not part of the list.

// Enter list1: 5 2 5 6 1 6
// Enter list2: 5 2 5 6 1 6
// Two lists are strictly identical

// Enter list1: 5 2 5 6 6 1
// Enter list2: 5 2 5 6 1 6
// Two lists are not strictly identical

import java.util.Scanner;

public class Exercise6 {
	// checks if two lists are identical
	public static boolean equals(int[] list1, int[] list2) {
		boolean retVal = true;
		if (list1.length != list2.length) retVal = false;
		else 
			for (int i = 0; i < list1.length; i++) {
				if (list1[i] != list2[i]) retVal = false;
			}
		return retVal;
	}
	// function to convert String[] to int[]
	public static int[] stringArrToIntArr(String[] arr) {
		int[] retArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			retArr[i] = Integer.parseInt(arr[i]);
		}
		return retArr;
	}
	public static void main(String[] args) {
		// declaring and initializing scanner
		Scanner sc = new Scanner(System.in);
		
		// capturing input, splitting on whitespace, storing in stringList array
		System.out.print("Enter list1: ");
		String[] stringList1 = sc.nextLine().split("\\s+");
		System.out.print("Enter list2: ");
		String[] stringList2 = sc.nextLine().split("\\s+");
		
		// converting using stringArrToIntArr function
		int[] intList1 = stringArrToIntArr(stringList1);
		int[] intList2 = stringArrToIntArr(stringList2);
		
		// output
		if (equals(intList1, intList2) == true) {
			System.out.println("Two list are strictly identical");
		}
		else {
			System.out.println("Two lists are not strictly identical");
		}
		
		// closing scanner
		sc.close();
	}
}