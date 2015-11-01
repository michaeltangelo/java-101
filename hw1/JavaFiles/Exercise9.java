// Write a program that prompts the user to enter the minutes (e.g. 1 billion), and displays the number of years
// and days for the minutes. For simplicity, assume a year has 365 days. Here is a sample run:

// Enter the number of minutes: 10000000
// 100000000 minutes is approximately 1902 years and 214 days.

import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args){
		// initialize Scanner
		Scanner sc = new Scanner(System.in);

		// prompt for minutes
		System.out.print("Enter the number of minutes: ");
		long minutes = sc.nextLong();
		System.out.println();

		long hours = minutes/60;
		long days = hours/24;
		long years = days/365;
		long leftoverDays = days%365;

		// output years and days
		System.out.printf("%d minutes is approximately %d years and %d days.\n", minutes, years, leftoverDays);

		// close scanner
		sc.close();
	}
}