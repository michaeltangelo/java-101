// Polymorphism refers to an object's ability to take on multiple forms.
// In the example below, human class reference anakin takes on the form of many different subclasses, including:
// Jedi, Padawan, and Master

// human class
class Human {
	public void useForce() {
		System.out.println("A human being attempted to use the force.");
		System.out.println("Nothing happened.");
	}
}

// a Jedi IS-A human
class Jedi extends Human {
	public void useForce() {
		System.out.println("A blossoming Jedi attempted to use the force.");
		System.out.println("There has been a disturbance in the force.");
	}
}

// a Padawan IS-A Jedi
class Padawan extends Jedi {
	public void useForce() {
		System.out.println("A bright, young Padawan attempted to use the force.");
		System.out.println("The force is not as strong with this one.");
		System.out.println("Pigs barely flew.");
	}
}

// a Master IS-A Jedi
class Master extends Jedi {
	public void useForce() {
		System.out.println("A Jedi Master attempted to use the force.");
		System.out.println("The force is strong with this one.");
		System.out.println("Mountains crumble to the earth.");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		// instantiating object anakin as type Human
		Human anakin = new Human();
		// calls useForce() -> Human's useForce method is called
		anakin.useForce();
		System.out.println();

		// If we assign anakin to a new Jedi object, anakin's type becomes class Jedi
		anakin = new Jedi();
		// therefore, calling useForce calls Jedi's useForce method
		anakin.useForce();
		System.out.println("Anakin is of " + anakin.getClass());
		System.out.println();

		// Assigning anakin to a new Padawan object, anakin's type becomes a Padawan
		anakin = new Padawan();
		anakin.useForce();
		System.out.println();

		// Same thing occurs when we assign anakin to a new Master object.
		anakin = new Master();
		anakin.useForce();
		System.out.println();

	}
}