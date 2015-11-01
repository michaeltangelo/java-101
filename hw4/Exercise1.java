import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		// 7.2 (Reverse the numbers entered) Write a program that reads ten integers and dis-
		// plays them in the reverse of the order in which they were read.
		
		// declaring and initializing scanner
		Scanner sc = new Scanner(System.in);
		
		// creating int array of 10 ints
		int[] ints = new int[10];
		
		// filling array with user input
		for (int i = 0; i < 10; i++) {
			System.out.printf("Enter number %d: \n", i+1);
			ints[i] = sc.nextInt();
		}
		
		// prints reverse of array
		System.out.println("Printing Reverse: ");
		for (int i = ints.length-1; i >= 0; i--) {
			System.out.print(ints[i] + " ");
		}
		System.out.println();

		sc.close();
	}
}