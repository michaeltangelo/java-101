import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookDirectory {
	private static Scanner sc = new Scanner(System.in);
	ArrayList<PhoneBookEntry> phoneBookDirectory = new ArrayList<PhoneBookEntry>();

	// prints out all the menu options and returns a String to be used in the main app
	public String mainMenu(){
		System.out.println("Welcome to the main menu. You may:");
		System.out.println("[1] Add an entry");
		System.out.println("[2] Print all entries");
		System.out.println("[3] Search for an entry (last name)");
		System.out.println("[4] Search for an entry (phone number)");
		System.out.println("[5] Edit an entry");
		System.out.println("[6] Delete an entry");
		System.out.println("[7] Quit");
//		System.out.println("[8] Sort the Phonebook (BONUS - Selection Sort)");
//		System.out.println("[9] Search by last name (BONUS -  Binary Search)");
		while (true) {
			String selection = sc.nextLine();
			if (Integer.parseInt(selection) < 1 || Integer.parseInt(selection) > 9) {
				System.out.println("That is not a valid option. Try again.");
				continue;
			}
			else {
				return selection;
			}
		}
	}
	
	// prompts user for 5 properties
	// will then construct a new PhoneBookEntry using the 5 arg constructor
	// and will add the Entry to the ArrayList
	public void addEntry() {
		while(true) {
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

			phoneBookDirectory.add(new PhoneBookEntry(firstName, lastName, email, zipcode, phoneNumber));

			System.out.printf("%s has been added to the phone book directory.\n\n",firstName);

			System.out.println("Would you like to add another entry? 'Y' to proceed.");
			if (!sc.nextLine().toLowerCase().equals("y")) {
				System.out.println("Returning to Main Menu.\n");
				return;
			}
			continue;
		}
	}


	// loops through all objects in the ArrayList and prints them
	public void printAll() {
		System.out.println("\nPrinting All Entries:\n");
		for (int i = 0; i < phoneBookDirectory.size(); i++) {
			if (phoneBookDirectory.get(i) == null) continue;
			phoneBookDirectory.get(i).printBookEntry();
		System.out.println("Hit any key to return to the Main Menu.");
		sc.nextLine();
		System.out.println();
		return;
	}
	
	// loops through all objects in the ArrayList
	// if the object's lastName is equal to the searchString, prints the element
	public void searchByLastName() {
		System.out.println("Enter a last name to search by (case insensitive):");
		String searchString = sc.nextLine();
		
		for (int i = 0; i < phoneBookDirectory.size(); i++) {
			if (phoneBookDirectory.get(i) == null) continue;
			if (phoneBookDirectory.get(i).getLastName().toLowerCase().equals(searchString.toLowerCase())){
				System.out.println("Result found!");
				phoneBookDirectory.get(i).printBookEntry();
				System.out.println("Hit any key to return to the Main Menu.");
				sc.nextLine();
				System.out.println();
				return;
			}
		}
		
		System.out.println("Entry does not exist. Hit any key to return to the Main Menu.");
		sc.nextLine();
		System.out.println();
		return;
	}
	
	// loops through all objects in the ArrayList
	// if the object's phoneNumber is equal to the searchNumber, prints the element
	public void searchByPhoneNumber() {
		System.out.println("Enter a phone number to search by: ");
		String searchNumber = sc.nextLine();
		
		for (int i = 0; i < phoneBookDirectory.size(); i++) {
			if (phoneBookDirectory.get(i) == null) continue;
			if (phoneBookDirectory.get(i).getPhoneNumber().equals(searchNumber)){
				System.out.println("Result found!");
				phoneBookDirectory.get(i).printBookEntry();
				System.out.println("Hit any key to return to the Main Menu.");
				sc.nextLine();
				System.out.println();
				return;
			}
		}
		
		System.out.println("Entry does not exist. Hit any key to return to the Main Menu.");
		sc.nextLine();
		System.out.println();
		return;
	}


	// allows a user to select the index of an element to edit
	// then allows user to select which number to update
	// updates the respective property the entry with user input
	public void editAnEntry() {
		while (true) {
			System.out.println("Enter an entry # to edit (begin at index 0). 'Q' to quit.");
			String input = sc.nextLine();
			if (input.equals("Q")) break;
			
			int entryNum = Integer.parseInt(input);
			
			if (phoneBookDirectory.get(entryNum) == null) {
				System.out.println("Entry does not exist.");
			}
			else {
				phoneBookDirectory.get(entryNum).printBookEntry();
				System.out.println("Would you like to change:");
				System.out.println("[1] First Name");
				System.out.println("[2] Last Name");
				System.out.println("[3] Email");
				System.out.println("[4] Zipcode");
				System.out.println("[5] Phone Number");
				String newField = sc.nextLine();
				switch (newField) {
					case "1":	System.out.println("Enter a new first name");
								phoneBookDirectory.get(entryNum).setFirstName(sc.nextLine());
								break;
					case "2":	System.out.println("Enter a new last name:");
								phoneBookDirectory.get(entryNum).setLastName(sc.nextLine());
								break;
					case "3":	System.out.println("Enter a new email:");
								phoneBookDirectory.get(entryNum).setEmail(sc.nextLine());
								break;
					case "4":	System.out.println("Enter a new zipcode:");
								phoneBookDirectory.get(entryNum).setZipcode(sc.nextLine());
								break;
					case "5":	System.out.println("Enter a new phone number:");
								phoneBookDirectory.get(entryNum).setPhoneNumber(sc.nextLine());
								break;
				}
				System.out.println("Entry has been updated.\n");
				break;
			}
		}
		System.out.println("Hit any key to return to the Main Menu.");
		sc.nextLine();
		System.out.println();
		return;
	}

	// allows user to specify an element to delete
	// if the entry exists, it will be removed from the arraylist
	public void deleteEntry() {
		int deleteIndex;
		System.out.println("Enter a entry # to delete (begin at index 0):");
		deleteIndex = sc.nextInt();
		if (phoneBookDirectory.size() < deleteIndex) {
			System.out.println("That entry doesn't exist. Hit any key to return to the Main Menu.\n");
			sc.nextLine();
			System.out.println();
			return;
		}
		System.out.printf("Entry [%s] has been deleted. Hit any key to return to the Main Menu.\n\n", phoneBookDirectory.get(deleteIndex-1).getFirstName());
		phoneBookDirectory.remove(deleteIndex-1);
		sc.nextLine();
		System.out.println();
		return;
	}
	
	// returns nothing, will be handled by main app
	public void quit() {
		return;
	}
	
//	public static void main(String[] args) {
//		PhoneBookDirectory directory = new PhoneBookDirectory();
//		directory.phoneBookDirectory[0] = new PhoneBookEntry("Bob","Junior","bobj@gmail.com","47906","7655869198");
//		directory.phoneBookDirectory[1] = new PhoneBookEntry("Bob", "Senior", "bobs@gmail.com", "47906", "7654637208");
//		directory.phoneBookDirectory[2] = new PhoneBookEntry("Skylar","White","imabitch@gmail.com","47906","1231231234");
//		directory.phoneBookDirectory[4] = new PhoneBookEntry("Walter", "Heisenberg","bossman@gmail.com","47906","1235124444");
//		directory.selectionSortLastName();
//		directory.printAll();
//	}
}