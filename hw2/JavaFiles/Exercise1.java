import java.util.Scanner;

public class Exercise1 {

	// initializing variables
	private static Scanner sc = new Scanner(System.in);
	private static double currentBalance = 0;
	private static String action = "mainMenu";
	private static String pin = "0000";
	
	// login screen
	public static void login() {
		System.out.println("WELCOME");
		System.out.println("-------");
		System.out.println("For the sake of Exercise1, your PIN is '0000'");
		System.out.print("Enter your PIN: ");
		String pinCheck = "";
		while (true) {
			pinCheck = sc.nextLine();
			if (pin.equals(pinCheck)) {
				System.out.println("Successful Login\n");
				break;
			}
			else if (pinCheck.equals("1")) {
				exit();
			}
			else {
				System.out.println("Invalid PIN");
				System.out.println("To exit, press 1.");
				System.out.println();
				System.out.print("Enter your PIN: ");
			}
		}
	}
	
	
	// main menu output screen
	public static void mainMenu() {
		System.out.println("1. View Balance");
		System.out.println("2. Deposit Cash");
		System.out.println("3. Withdraw Cash");
		System.out.println("4. Change PIN");
		System.out.println("5. Exit");
		System.out.println();
		System.out.println("Enter your selection: ");
	}

	public static void main(String[] args) {
		login();
		do{
			mainMenu();
			int choice = sc.nextInt();
			System.out.println();
			switch (choice) {
				case 1: viewBalance();
						break;
				case 2: depositCash();
						break;
				case 3: withdrawCash();
						break;
				case 4: changePin();
						break;
				case 5: action = "exit";	// exit program
						break;
			}
		} while (action.equals("mainMenu"));

		if (action.equals("exit")) {
			exit();
		}
	}

	public static void changePin() {
		System.out.println("Enter a new PIN: ");
		String newPin = sc.next();
		if (!newPin.equals(pin)) {
			pin = newPin;
			System.out.printf("PIN successfully updated. Your new PIN is: %s\n\n", pin);
		}
		else {
			System.out.println("You cannot use the same PIN as before! Try again.");
			changePin();
		}
	}
	
	public static void exit() {
		System.out.println("Goodbye.");
	}
	public static void viewBalance() {
		System.out.printf("Your current balance is %.2f\n", currentBalance);
	}

	public static double depositCash() {
		double amount;

		while (true) {
			System.out.print("Enter the amount you want to deposit: ");
			amount = sc.nextDouble();
			if (amount < 0) {
				System.out.println("Please enter a positive number. Try again.");
				System.out.println();
				continue;
			}
			break;
		}

		currentBalance += amount;

		return currentBalance;
	}

	public static double withdrawCash() {
		double amount;

		while (true) {
			System.out.print("Enter the amount you want to withdraw: ");
			amount = sc.nextDouble();
			if (amount > currentBalance) {
				System.out.println("You do not have enough balance. Try again.");
				System.out.println();
				continue;
			}
			else if (amount < 0) {
				System.out.println("Please enter a positive number. Try again.");
				System.out.println();
				continue;
			}
			break;
		}

		currentBalance -= amount;

		return currentBalance;
	}
}