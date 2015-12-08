import java.util.Scanner;

public class PhoneBook {
	private static Scanner sc = new Scanner(System.in);
	private static PhoneBookEntry john = new PhoneBookEntry();
	private static PhoneBookEntry james = new PhoneBookEntry();
	private static PhoneBookEntry sarah = new PhoneBookEntry();

	private static void writePhoneBookEntry(PhoneBookEntry entry) {
		System.out.println("Enter a string of values separated by commas: ");
		System.out.println("Example");
		System.out.println("John,Smith,jsmith@gmail.edu,20037,2023334444\n");

		String input;
		String[] inputArr;

		while (true) {
			input = sc.nextLine();
			if (input.equals("")) continue;
			
			inputArr = input.split(",");

			if (inputArr.length == 5) {
				entry.setFirstName(inputArr[0]);
				entry.setLastName(inputArr[1]);
				entry.setEmail(inputArr[2]);
				entry.setZipcode(inputArr[3]);
				entry.setPhoneNumber(inputArr[4]);
			}

			else if (inputArr.length == 2) {
				entry.setFirstName(inputArr[0]);
				entry.setPhoneNumber(inputArr[1]);
			}

			else if (inputArr.length == 1) {
				entry.setFirstName(inputArr[0]);
			}

			else {
				System.out.println("Invalid number of arguments, try again");
				continue;
			}
			System.out.println();
			break;
		}
	}

	private static void makePhoneBookEntry() {
		while (true) {
			System.out.println("First name: ");
		}
	}

	public static void main(String[] args) {
		PhoneBookEntry john = new PhoneBookEntry();

		System.out.println("John");
		john.printBookEntry();

		System.out.println("James");
		james.printBookEntry();
		
		System.out.println("Sarah");
		sarah.printBookEntry();
		// PhoneBookEntry john = new PhoneBookEntry("John","Smith","jsmith@gmail.edu","20037","2023334444");
		// PhoneBookEntry james = new PhoneBookEntry("James","202344344");
		// PhoneBookEntry sarah = new PhoneBookEntry();

		sc.close();
	}
}