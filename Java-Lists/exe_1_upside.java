package homework7;

import java.util.Scanner;

public class exe_1_upside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);

		int size = 5;
		int[] array = new int[size]; // Defining a Variable Array
		int[] array2 = new int[size]; //  Defining a Variable Array2
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("enter your number for array [" + i + "]");
			array[i] = user.nextInt(); // Receive 5 numbers from the user to the Array
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println("enter your number for array2 [" + i + "]");
			array2[i] = user.nextInt(); // Receive 5 numbers from the user to the Array2
		}

		for (int j = 0; j < array.length; j++) { 
			if (array[size - 1] == array2[j]) {
				size--; 
				counter++; 
			}
		}
		if (counter == 5) { // If Counter is equal to 5
			System.out.println("upside");

		} else { // If not equal to 5
			System.out.println("not upside");
		}
	}

}
