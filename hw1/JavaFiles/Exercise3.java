import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// initialize scanner object
		Scanner sc = new Scanner(System.in);

		// prompt and store user input
		System.out.print("Enter desired grade> ");
		char desiredGrade = sc.next().charAt(0);

		System.out.print("Enter minimum average required> ");
		double minAvg = sc.nextDouble();

		System.out.print("Enter current average in course> ");
		double currentAvg = sc.nextDouble();

		System.out.print("Enter how much the final counts as a percentage of the course grade> ");
		double finalWeight = sc.nextDouble();
		double finalWeightDecimal = finalWeight/100;

		// calculate needed score
		double finalScore;
		finalScore = (minAvg - (currentAvg * (1-(finalWeightDecimal)))) / finalWeightDecimal;

		// output needed score
		System.out.println(String.format("You need a score of %.2f on the final to get a %c.", finalScore, desiredGrade));

		sc.close();
	}
}