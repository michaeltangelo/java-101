import java.util.Scanner;
public class Exercise5_simpleSolution {
	public static void main(String[] args) {
		String password = "NYU1256";

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a password: ");
		String guess = scan.next();

		if (guess.equals(password)==true) {
			System.out.println("Valid password.");
		}
		else {
			System.out.println("Invalid password. Try again.");
		}
	}	
}