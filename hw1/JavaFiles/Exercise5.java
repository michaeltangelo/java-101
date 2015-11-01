import java.security.MessageDigest;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Exercise5 {

	/*
		Name: md5Encrypt
		Input: String
		Processing: converts String input to MD5 Encrypted ByteArray
		Output: ByteArray
	*/ 
	public static byte[] md5Encrypt(String input) throws Exception {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(input.getBytes());
		byte[] MD5ByteArray = md.digest();
		return MD5ByteArray;
	}


	/*
		Name: hashToString
		Input: StringBuffer and ByteArray
		Processing: converts the MD5 Encrypted ByteArray to a hex String
		Output: String
	*/
	public static String hashToString(StringBuffer x, byte[] byteArray) {
		for (int i = 0; i < byteArray.length; i++) {
			x.append(Integer.toString((byteArray[i] & 0xff) + 0x100, 16).substring(1));
		}
		
		return x.toString();
	}

	/*
		Name: printCharByChar
		Input: String
		Processing: prints input string one character at a time with 30ms delay
		Output: no output -> prints string to console
	*/
	public static void printCharByChar(String str) throws Exception {
		try {
			for (int i = 0; i< str.toString().length(); i++) {
			System.out.print(str.charAt(i));
			TimeUnit.MILLISECONDS.sleep(30);
			}
		}
		catch (InterruptedException e) {
			System.out.println("Exception in function printCharByChar");
		}
		
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		// hard code password (use hashed string to prevent potential security leak)
		String password = "7bf2267a7e5a620d693fbd8a0a3e2b79";
		
		// initialize scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String pw = sc.next();

		// Encrypt password with MD5 Hash - Referenced from "http://www.mkyong.com/java/java-md5-hashing-example/"
		byte[] newDigest = md5Encrypt(pw);
		
		// converting new pw from byte to hex
		StringBuffer newPwHashed = new StringBuffer();
		hashToString(newPwHashed, newDigest);
		
		// convert StringBuffer to String -> store in newHash
		String newHash = newPwHashed.toString();
		
		// Output hashed password character by character with delay
		System.out.println("Encrypting Password");
		printCharByChar(newPwHashed.toString());
		
		// Output '*' one at a time with delay
		System.out.println("Matching Password");
		for (int i = 1; i < newPwHashed.toString().length(); i++) {
			TimeUnit.MILLISECONDS.sleep(30);
			System.out.print("*");
		}
		System.out.println();
		
		// Simulating processing time with delay
		System.out.print("Please wait");
		for (int i = 0; i < 3; i++) {
			TimeUnit.MILLISECONDS.sleep(150);
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(350);
		}
		System.out.println();
		
		// check if password match
		if (newHash.equals(password)) {
			System.out.println("SUCCESS! Your password is valid.");
		}
		else {
			System.out.println("ERROR: Password does not match.");
		}

		sc.close();
	}
}