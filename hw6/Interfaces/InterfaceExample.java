	// 1. What is an “interface” in Java? Provide your own example.

	// An Interface is a java file that is quite similar to a class -- interfaces (can) have methods and variables,
	// but if methods are used, they are written without a body.
	// Interfaces can also have variables, which by default will be public, static, and final. All variables MUST be initialized when declared.

	// creating interface
	interface MyInterface {
		int num = 100;
		public void interfaceMethod();
	}

	// main class implementing MyInterface interface
	public class InterfaceExample implements MyInterface {
		@Override
		public void interfaceMethod() {
			System.out.println("This is using MyInterface's abstract interfaceMethod method.");	
		}
		public static void main(String[] args) {
			InterfaceExample foo = new InterfaceExample();
			foo.interfaceMethod(); // outputs "This is using MyInterface's abstract interfaceMethod method."
		}
	}