import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {

		int[] col1 = {1,8,1,1};
		int[] col2 = {5,7,6,7};
		int[] col3 = {9,9,0,9};

		System.out.printf("%-5s%-5s%-5s", "A", "B", "C");
		System.out.println();

		for (int i = 0; i < 4; i++) {
			System.out.printf("%-5d", col1[i]);
			System.out.printf("%-5d", col2[i]);
			System.out.printf("%-5d", col3[i]);
			System.out.println();
		}
	}
}
