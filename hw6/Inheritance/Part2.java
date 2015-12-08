import java.util.Date;
import java.text.SimpleDateFormat;

// 11.2 (The Person, Student, Employee, Faculty, and Staff classes) Design a class named Person and its two subclasses named Student and Employee.

// Make Faculty and Staff subclasses of Employee. 

// A person has a name, address, phone number, and email address. 
// A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant. 
// An employee has an office, salary, and date hired. Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired. 
// A faculty member has office hours and a rank. 
// A staff member has a title. 

// Override the toString method in each class to display the class name and the person’s name.
// Draw the UML diagram for the classes and implement them. 

// Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.

public class Part2 {
	public static void main(String[] args) {
		Person person = new Person("Michael", "349 E 10th St", "7655869198", "michaeltan@nyu.edu");
		System.out.println(person.toString());

		Student student = new Student("Bob", "721 Broadway Ave", "123456879", "bob@nyu.edu", "sophomore");
		System.out.println(student.toString());

		Employee employee = new Employee("Freddie", "25 Union Sq W", "5678389299", "employee@nyu.edu", "27A", "60000", new MyDate("2002","12","08"));
		System.out.println(employee.toString());

		Faculty faculty = new Faculty("George", "33 Washington Sq W", "7573839293", "george@nyu.edu", "83B", "120000", new MyDate("2008","08","19"), "2:00-4:00pm", "Professor");
		System.out.println(faculty.toString());

		Staff staff = new Staff("Donald", "99 Covington St", "134738231", "donald@nyu.edu", "37C", "500000", new MyDate("2012","12","04"), "Doctor");
		System.out.println(staff.toString());
	}
}

class MyDate {
	private String year;
	private String month;
	private String day;
	public MyDate() {
		Date date = new Date();
		this.year = new SimpleDateFormat("yyyy").format(date);
		this.month = new SimpleDateFormat("MM").format(date);
		this.day = new SimpleDateFormat("dd").format(date);
	}

	public MyDate(String elapsed) {
		Date date = new Date(Long.parseLong(elapsed));
		this.year = new SimpleDateFormat("yyyy").format(date);
		this.month = new SimpleDateFormat("MM").format(date);
		this.day = new SimpleDateFormat("dd").format(date);
	}

	public MyDate(String year, String month, String day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public String getYear() {
		return this.year;
	}

	public String getMonth() {
		return this.month;
	}

	public String getDay() {
		return this.day;
	}

	public void setDate(long elapsedTime) {
		Date date = new Date(elapsedTime);
		year = new SimpleDateFormat("yyyy").format(date);
		month = new SimpleDateFormat("MM").format(date);
		day = new SimpleDateFormat("dd").format(date);
	}
}

class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	public Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Person " + name;
	}
}

class Student extends Person {
	private final String classStatus;

	public Student(String name, String address, String phoneNumber, String email, String classStatus) {
		super(name, address, phoneNumber, email);
		this.classStatus = classStatus;
	}

	public String getClassStatus() {
		return classStatus;
	}
	@Override
	public String toString() {
		return "Student " + super.getName();
	}
}

class Employee extends Person {
	private String office;
	private String salary;
	private MyDate dateHired;

	public Employee(String name, String address, String phoneNumber, String email, String office, String salary, MyDate dateHired) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	public String getOffice() {
		return office;
	}

	public String getSalary() {
		return salary;
	}

	public String getDateHired() {
		return dateHired.getYear() + "-" + dateHired.getMonth() + "-" + dateHired.getDay();
	}

	@Override
	public String toString() {
		return "Employee " + super.getName();
	}
}

class Faculty extends Employee {
	private String officeHours;
	private String rank;

	public Faculty(String name, String address, String phoneNumber, String email, String office, String salary, MyDate dateHired, String officeHours, String rank) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public String getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return "Faculty " + super.getName();
	}
}

class Staff extends Employee {
	private String title;

	public Staff(String name, String address, String phoneNumber, String email, String office, String salary, MyDate dateHired, String title) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {
		return "Staff " + super.getName();
	}
}