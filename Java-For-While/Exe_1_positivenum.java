package homework5;

import java.util.Scanner;

public class Exe_1_positivenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tamir = new Scanner(System.in);

		int num; // Variable num
		int counter = 0; // Counting variable

		System.out.println(" choose your number"); // Entering numbers by the user
		num = tamir.nextInt();

		while (num > 0) {
			if (num % 2 == 1) // Perform module 2 if the number is equal to 1
				counter++; // Variable action count
			num /= 10;
		}
		System.out.println(counter); // Show the user how many odd numbers exist

		tamir.close();
	}
}
