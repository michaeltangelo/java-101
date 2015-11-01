import java.util.Scanner;
public class Exercise0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub

		System.out.println("what is your first name?");

		String name = sc.next();

		System.out.println("What is your major?");

		sc.nextLine();
		String major = sc.nextLine();

		System.out.println("Your name is: " + name);
		System.out.println("Your major is: " + major);

		sc.close();
	}

}