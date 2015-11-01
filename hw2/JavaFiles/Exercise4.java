import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		// initialize scanner
		Scanner sc = new Scanner(System.in);

		// get string inputs
		System.out.println("Enter the first string: ");
		String s1 = sc.nextLine();

		System.out.println("Enter the second string: ");
		String s2 = sc.nextLine();

		// initialize largestCommonPrefix
		String largestCommonPrefix = "";

		// for efficiency, take the minimum length of each string to search
		// referenced from: http://www.leveluplunch.com/java/examples/common-prefix-between-strings/
		int minimumLength = Math.min(s1.length(), s2.length());

		// start from initial position, loop until minimumLength
		for (int i = 0; i < minimumLength; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				largestCommonPrefix = s1.substring(0,i);
				break;
			}
		}

		// output results
		if (!largestCommonPrefix.isEmpty()) {
			System.out.printf("The largest common prefix is %s\n", largestCommonPrefix);
		}
		else {
			System.out.printf("%s and %s have no common prefixes.\n", s1, s2);
		}
	}
}