// (Sorted?) Write the following method that returns true if the list is already sorted in 
// increasing order.

// public static boolean isSorted(int[] list)

// Write a test program that prompts the user to enter a list and displays whether the list is 
// sorted or not. Here is a sample run. Note that the first number in the input 
// indicates the number of the elements in the list. This number is not part of the list.

// Enter list: 8 10 1 5 16 61 9 11 1
// The list is not sorted

// Enter list: 10 1 1 3 4 4 5 7 9 11 21
// The list is already sorted

import java.util.Scanner;

public class Exercise5 {

	// returns true if int[] is sorted, else returns false
	public static boolean isSorted(int[] list) {
		int currentVal = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i] >= currentVal) {
				currentVal = list[i];
			}
			else return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// declaring and initializing scanner for input
		Scanner input = new Scanner(System.in);

		// prompt input
		System.out.println("Enter list: ");

		// capturing user input in variable inputString
		String inputString = input.nextLine();

		// closing input scanner
		input.close();
		
		// open new scanner to read the input string
		Scanner str = new Scanner(inputString);

		// arrLength variable set to first int of string input
		int arrLength = str.nextInt();
		
		// declaring and initializing int array with user chosen length
		int[] list = new int[arrLength];
		
		// filling array with rest of user input
		for (int i = 0; i < arrLength; i++) {
			list[i] = str.nextInt();
		}
		
		// closing second scanner
		str.close();
		
		// output
		if (isSorted(list) == true) {
			System.out.println("The list is already sorted");
		}
		else {
			System.out.println("The list is not sorted");
		}
		
	}
}