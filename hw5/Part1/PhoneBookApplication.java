//import java.util.Scanner;

public class PhoneBookApplication {
	// creating static directory object for use in main
	private static PhoneBookDirectory Directory = new PhoneBookDirectory();
	
	public static void main(String[] args) {

		// do while loop selects the correct method from the PhoneBookDirectory class based on user input
		// the loop will stop if the user inputs "7" which is the corresponding string for 'quit'

		String menuOption = "";
		do {
			menuOption = Directory.mainMenu(); 
			switch(menuOption) {
				case "1":	Directory.addEntry();
							break;
				case "2":	Directory.printAll();
							break;
				case "3":	Directory.searchByLastName();
							break;
				case "4":	Directory.searchByPhoneNumber();
							break;
				case "5":	Directory.editAnEntry();
							break;
				case "6":	Directory.deleteEntry();
							break;
				case "7":	Directory.quit();
							break;
			}
		} while (!menuOption.equals("7"));
	}
}
