import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		// initialize scanner
		Scanner sc = new Scanner(System.in);

		// prompt user for number of rows
		System.out.println("Enter a number of lines: ");
		int lines = sc.nextInt();
		
		// establish rows
		for (int row = 1; row <= lines; row++) {
			
			// draw left triangle of pyramid
			// account for digits over 10
			int extraSpace = lines-10;
			for (int space = lines - row; space > 0; space--) {
				// triple spaces for double digit integers
				if (extraSpace >= 0) {
					System.out.print("   ");
					extraSpace--;
				}
				// double spaces for single digit integers
				else {
					System.out.print("  ");
				}
			}
			
			// select number to output
			int num = row;
			for (int col = 1; col < row; col++) {
				System.out.print(num);
				System.out.print(" ");
				num--;
			}
			System.out.print(num + " ");
			
			// draw right triangle of pyramid
			for (int col = 2; col <= row; col++) {
				System.out.print(col);
				System.out.print(" ");
			}

			// line break for next row iteration
			System.out.println();
		}
		
		sc.close();
	}
}