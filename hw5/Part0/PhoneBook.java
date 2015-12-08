import java.util.Scanner;

public class PhoneBook {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// can assume John input will be:
		// "John,Smith,jsmith@gmail.edu,20037,2023334444"
		
		// split John input into string array by ","
		// initialize john using 5 argument constructor
		
		System.out.println("Enter John info:");
		String[] johnInfo = sc.nextLine().split(",");
		PhoneBookEntry john = new PhoneBookEntry(johnInfo[0],johnInfo[1],johnInfo[2],johnInfo[3],johnInfo[4]);
		System.out.println();
		
		// can assume James input will be:
		// "James,2023444344"
		
		// split James input into string array by ","
		// initialize james using 5 argument constructor
		
		System.out.println("Enter James info:");
		String[] jamesInfo = sc.nextLine().split(",");
		PhoneBookEntry james = new PhoneBookEntry(jamesInfo[0],jamesInfo[1]);
		System.out.println();
		
		// can assume Sarah input will be:
		// "Sarah"
		
		// intialize Sarah with default 0 argument constructor
		// set Sarah first name using setFirstName() method
		
		System.out.println("Enter Sarah info:");
		String sarahInfo = sc.nextLine();
		PhoneBookEntry sarah = new PhoneBookEntry();
		sarah.setFirstName(sarahInfo);
		System.out.println();
		
		// Other required tasks:
		// Change the phone number of John Smith to 202555555
		john.setPhoneNumber("202555555");
		System.out.println("Set John's Phone number to 202555555\n");
		// Print the attributes of John Smith using the PrintBookEntry.
		john.printBookEntry();
		// Assign the Zipcode of John Smith to James’s.
		john.setZipcode(james.getZipcode());
		System.out.println("Set John's Zipcode to James's Zipcode\n");
	
		sc.close();
	}
}