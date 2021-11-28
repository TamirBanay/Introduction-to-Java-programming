package homework5;

import java.util.Scanner;

public class Exe_2_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tamir = new Scanner(System.in);

		System.out.println(" Please enter ur number"); // Receiving a number from the user
		int num = tamir.nextInt();

		int numOfZero = num - 1;
		int tempNumOfZero = numOfZero;
		for (int i = 1; i <= num; i++) { 
			tempNumOfZero = numOfZero;
			for (int j = 1; j <= num; j++) {

				while (tempNumOfZero > 0) { // When the tempNumOfZero variable is greater than 0
					System.out.print('0'); // Print 0
					tempNumOfZero--; // tempNumOfZero -1
					j++; // j +1
				}
				System.out.print(i); // Print (i) from loop for
			}
			System.out.println(); // Line drop in loop
			numOfZero--; // numOfZero -1
		}
		tamir.close();

	}

}