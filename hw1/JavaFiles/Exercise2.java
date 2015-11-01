import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// initialize scanner object
		Scanner sc = new Scanner(System.in);

		// receive input - # of kilometers | stores input
		System.out.println("Enter a number in kilometers: ");
		double km = sc.nextDouble();

		// calculate miles
		double miles = km/1.6214;

		// output miles formatted to 2 decimal places
		System.out.println(String.format("%s kilometers is equivalent to %.2f miles", km, miles));

		sc.close();
	}
}