import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// initialize scanner object
		Scanner sc = new Scanner(System.in);

		// get user input in Fahrenheit
		System.out.print("Enter a number of degrees in Fahrenheit: ");
		double fTemp = sc.nextDouble();

		// calculate celcius
		double cTemp;
		cTemp = (5.0 / 9) * (fTemp - 32);

		// output celcius
		System.out.println(String.format("%.2f degrees in Fahrenheit is equal to %.2f in Celcius.", fTemp, cTemp));

		sc.close();
	}
}