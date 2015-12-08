public class PhoneBookDirectory {
	private static Scanner sc = new Scanner(System.in);
	PhoneBookEntry[] phoneBookDirectory = new PhoneBookEntry[10];

	public void addEntry(String entryConstruct) {
		counter = 0;
		do {
			System.out.println("Would you like to add an entry? 'Y' to proceed.");
			if (sc.nextLine() != 'Y') break;

			System.out.println("First name: ");
			String firstName = sc.nextLine();

			System.out.println("Last name: ");
			String lastName = sc.nextLine();

			System.out.println("Email: ");
			String email = sc.nextLine();

			System.out.println("Zipcode: ");
			String zipcode = sc.nextLine();

			System.out.println("Phone Number: ");
			String phoneNumber = sc.nextLine();

			phoneBookDirectory[counter] = new PhoneBookEntry(firstName, lastName, email, zipcode, phoneNumber);

			System.out.printf("%s has been added to the phone book directory.\n",firstName);

			counter++


		} while (counter <= 10;)
	}

	public static void main(String[] args) {
		PhoneBookDirectory directory = new PhoneBookDirectory();
		directory.addEntry()
	}
}