// Write a Java program that computes the maximum of two given numbers;
// You need to read the numbers from the console and display the maximum to the console	

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
	
		// initialize scanner object
		Scanner sc = new Scanner(System.in);

		// get and store input of 2 numbers
		System.out.println("Enter a number: ");
		double num1 = sc.nextDouble();

		System.out.println("Enter a second number: ");
		double num2 = sc.nextDouble();

		// calculate max
		double max = Math.max(num1, num2);

		// output max
		System.out.printf("The max of your numbers is: %f%n", max);

		// close scanner
		sc.close();
	}
}