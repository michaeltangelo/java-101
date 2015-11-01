import java.util.Scanner;
import java.lang.Math;

public class Exercise2 {
	public static void main(String[] args) {
		// initializing scanner
		Scanner sc = new Scanner(System.in);
		
		// gathering user input
		System.out.println("Enter an integer: ");
		int base = sc.nextInt();

		System.out.printf("What power do you want %d to be raised to? ", base);
		int exponent = sc.nextInt();

		// calculations
		int result = (int) Math.pow(base, exponent);

		// output with formatting
		String showWork = "";

		for (int i = 0; i < exponent; i++) {
			if (i == 0) {
				showWork += base + " x";
			}
			else if (i != exponent - 1) {
				showWork += " " + base + " x";
			}
			else if (i == exponent - 1) {
				showWork += " " + base;
			}
		}

		System.out.printf("%s = %d\n", showWork, result);

		sc.close();
	}
}