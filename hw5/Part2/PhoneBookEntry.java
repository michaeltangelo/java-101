public class PhoneBookEntry {
	private String firstName;
	private String lastName;
	private String email;
	private String zipcode;
	private String phoneNumber;

	public PhoneBookEntry() {
	}

	public PhoneBookEntry(String firstName, String lastName, String email, String zipcode, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.zipcode = zipcode;
		this.phoneNumber = phoneNumber;
	}

	public PhoneBookEntry(String firstName, String phoneNumber) {
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
	}

	public void printBookEntry() {
		printIfExists("First Name", firstName);
		printIfExists("Last Name", lastName);
		printIfExists("Email", email);
		printIfExists("Zipcode", zipcode);
		printIfExists("Phone Number", phoneNumber);
		System.out.println();
	}

	public void printIfExists(String key, String value) {
		if (value != null) {
			System.out.printf("%s: %s\n", key, value);
		}
	}

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