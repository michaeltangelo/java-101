import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// initialize scanner
		Scanner sc = new Scanner(System.in);

		// receive and store user input
		System.out.println("Enter a number: ");
		double x = sc.nextDouble();

		System.out.println("Enter a second number: ");
		double y = sc.nextDouble();

		// declare and calculate arithmetic variables
		double sum = x + y;
		double subtract = x - y;
		double quotient = x/y;
		double product = x*y;
		double remainder = x%y;

		// output calculations
		System.out.println(sum);
		System.out.println(subtract);
		System.out.println(quotient);
		System.out.println(product);
		System.out.println(remainder);

		sc.close();
	}
}