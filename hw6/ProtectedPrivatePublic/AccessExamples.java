public class AccessExamples {

	public static void main(String[] args) {
		exampleClass e = new exampleClass();
		System.out.println(e.protectedString);	 // outputs "I am a protected string."
		System.out.println(e.publicString); 	// outputs "I am a public string."
		//System.out.println(e.privateString); 	-- Cannot access private variable in another class

	}
}

class exampleClass extends AccessExamples {
	public String publicString = "I am a public string.";
	protected String protectedString = "I am a protected string.";
	private String privateString = "I am a private string.";
}
