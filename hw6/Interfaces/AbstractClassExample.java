// What is an “abstract class” in Java? Provide your own example.

// An abstract class is Java is a class that uses zero or more abstract methods.
// Abstract classes can contain both concrete and abstract methods.

// An example of an abstract class is below

abstract class AbstractClass {
	public void concreteMethod() {
		System.out.println("This is a concrete method from an abstract class.");
	}

	public abstract void abstractMethod();
}

public class AbstractClassExample extends AbstractClass {
	@Override
	public void abstractMethod() {
		System.out.println("This is an abstract method from an abstract class.");
	}

	public static void main(String[] args) {
		AbstractClassExample foo = new AbstractClassExample();

		// calls concreteMethod on abstract class
		foo.concreteMethod();

		// calls abstractMethod on abstract class after being overriden by AbstractClassExample
		foo.abstractMethod();
	}
}