package homework5;

import java.util.Scanner;

public class Exe_4_Asterisks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);
		int choiseuser;
		System.out.println(" please enter number "); // Receiving a number from the user
		choiseuser = user.nextInt();
		int general, emtyloop;
		int stars;

		for (general = choiseuser; general >= 1; general--) {
			for (emtyloop = choiseuser; emtyloop >= general; emtyloop--)
				System.out.print(" "); // Print space
			for (stars = general; stars > 0; stars--)
				System.out.print(" *"); // Asterisk print
			System.out.println(); // Print a line drop in the output
		}
		for (general = 1; general <= choiseuser; general++) {
			for (emtyloop = choiseuser; emtyloop >= general; emtyloop--)
				System.out.print(" "); // Print space
			for (stars = general; stars > 0; stars--)
				System.out.print(" *"); // Asterisk print
			System.out.println(); // Print a line drop in the output

			user.close();

		}

	}

}
