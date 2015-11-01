// Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and
// displays their distance between them.
// The formula for computing the distance is sqrt(((x2-x1)^2) + ((y2-y1)^2)). Note that you 
// can use Math.pow(a, 0.5) to compute sqrt(a). Here is a sample run:
// Enter x1 and y1: 1.5 -3.4 -> enter
// Enter x2 and y2: 4 5 -> enter
// The distance between the two points is 8.764131445842194

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args){
		// initialize Scanner
		Scanner sc = new Scanner(System.in);

		// get and store two points
		System.out.println("Enter x1 and y1: ");
		double p1x = sc.nextDouble();
		double p1y = sc.nextDouble();

		System.out.println("Enter x2 and y2: ");
		double p2x = sc.nextDouble();
		double p2y = sc.nextDouble();

		// calculate distance
		double distance = Math.sqrt((Math.pow(p2x-p1x,2) + (Math.pow(p2y-p1y,2))));

		// output distance
		System.out.printf("The distance between the two points is %f\n",distance);

		// close scanner
		sc.close();
	}
}
