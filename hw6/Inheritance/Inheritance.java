// 1. Define Inheritance in your own words. Provide your own complete
// example. Comment and explain your code.

// DEFINITION: Inheritance occurs when a class that is derived from another class
// (known as a subclass) inherits all the fields and methods of its superclass.

// Example of Inheritance

public class Inheritance {
	public static void main(String[] args) {
		// create instance of Example2 object foo, which is a subclass of Example1
		Example2 foo = new Example2();

		// Example2 inherits it's superclass's fields and methods as shown below:
		System.out.println(foo.superclassField);
		foo.superclassMethod();

		// Example2 also retains it's own methods as shown below:
		System.out.println(foo.subclassField);
		foo.subclassMethod();
	}
}

class Example1 {
	public String superclassField = "String from Superclass.";
	public void superclassMethod() {
		System.out.println("This method is from class Superclass.");
	}
}

class Example2 extends Example1 {
	public String subclassField = "String from subclass";
	public void subclassMethod() {
		System.out.println("Method from subclass.");
	}
}