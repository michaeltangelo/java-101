// (Count occurrence of numbers) Write a program that reads the integers between 1 and 100 and 
// counts the occurrences of each. Assume the input ends with 0.

// Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
// 2 occurs 2 times
// 3 occurs 1 time
// 4 occurs 1 time
// 5 occurs 2 times
// 6 occurs 1 time
// 23 occurs 1 time
// 43 occurs 1 time

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		// declaring and initializing scanner
		Scanner sc = new Scanner(System.in);
		
		// creates arrayList to store user input
		ArrayList<Integer> intList = new ArrayList<Integer>();
		// creates arrayList to count
		ArrayList<Integer> countArray = new ArrayList<Integer>();
		
		// prompt user for input
		System.out.println("Enter the integers between 1 and 100: ");

		// begin capturing and processing user input
		while (true) {
			int next = sc.nextInt();
			// breaks if 0
			if (next == 0) {
				break;
			}
			// if int next is already in list, increase counter in respective countArray index
			else if (intList.contains(next)){
				int count = countArray.get(intList.indexOf(next));
				countArray.set(intList.indexOf(next),count+1);
			}
			// creates new element in intList and sets it as input int
			// creates new element in countArray and sets it to 1
			else {
				intList.add(next);
				countArray.add(1);
			}
		}

		// Print output
		for (int i = 0; i < intList.size(); i++) {
			int a = intList.get(i); 		// intList element according to i iterator
			int b = countArray.get(i); 		// count value according to i iterator
			if (b != 1) {
				System.out.printf("%d occurs %d times\n", a, b);
			}
			else {
				System.out.printf("%d occurs %d time\n", a, b);
			}
		}

		// closing scanner
		sc.close();
	}
}