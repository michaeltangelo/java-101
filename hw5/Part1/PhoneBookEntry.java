public class PhoneBookEntry {
	// declaring all required class properties
	private static String firstName;
	private static String lastName;
	private static String email;
	private static String zipcode;
	private static String phoneNumber;

	// default 0 arg constructor
	public PhoneBookEntry() {
	}

	// overloaded 5 arg constructor
	public PhoneBookEntry(String firstName, String lastName, String email, String zipcode, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.zipcode = zipcode;
		this.phoneNumber = phoneNumber;
	}

	// overloaded 2 arg constructor
	public PhoneBookEntry(String firstName, String phoneNumber) {
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
	}

	// prints whichever field exists in the book entry
	public void printBookEntry() {
		printIfExists("First Name", firstName);
		printIfExists("Last Name", lastName);
		printIfExists("Email", email);
		printIfExists("Zipcode", zipcode);
		printIfExists("Phone Number", phoneNumber);
		System.out.println();
	}

	// prints if the field exists
	public void printIfExists(String key, String value) {
		if (value != null) {
			System.out.printf("%s: %s\n", key, value);
		}
	}

	// the following methods are all standard get/set methods for each of the class properties

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String i) {
		firstName = i;
	}
		
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String i) {
		lastName = i;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String i) {
		email = i;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String i) {
		zipcode = i;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String i) {
		phoneNumber = i;
	}

}