import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args){
		// initialize scanner
		Scanner sc = new Scanner(System.in);

		// get and store 3 grades
		System.out.println("Enter grade 1: ");
		double grade1 = sc.nextDouble();

		System.out.println("Enter grade 2: ");
		double grade2 = sc.nextDouble();

		System.out.println("Enter grade 3: ");
		double grade3 = sc.nextDouble();

		// calculate mean
		double mean = (grade1+grade2+grade3)/3;

		// output mean
		System.out.printf("Your average grade is %.2f.%n", mean);

		// close scanner
		sc.close();
	}
}