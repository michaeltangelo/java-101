import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 9; i++) {
			sum += i;
		}

		System.out.println("The sum of 1+2+3+...9 = " + sum);
		System.out.format("the sum of 1+2+3+...9 = %s%n", sum);
		System.out.print(String.format("The sum of 1+2+3+...9 = %s%n", sum));
	}
}