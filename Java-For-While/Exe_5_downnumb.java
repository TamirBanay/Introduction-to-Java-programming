package homework5;

import java.util.Scanner;

public class Exe_5_downnumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);

		System.out.println(" choose num form 2 - 20 "); // Asks the user to write down a number between 2-20
		int num = user.nextInt();

		if (num > 2 && num < 20) { // Checking the condition of a number greater than 2 and less than 20

			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j); // Print variable j
				}
				System.out.println(""); // Print space
			}
			for (int j = num; j > 1; j--) {
				for (int i = 1; i < j; i++) {
					System.out.print(i); // Print variable i

				}
				System.out.println(); // Print line drop
			}
		}

		else {

			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j); // Print variable j
				}
				System.out.println("");
			}
			for (int j = 5; j > 1; j--) {
				for (int i = 1; i < j; i++) {
					System.out.print(i); // Print variable i

				}
				System.out.println(); // Print line drop

				user.close();

			}
		}
	}
}
