package homework7;

import java.util.Scanner;

public class exe_3_roll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);

		int size = 5;
		int[] array = new int[size];
		int[] array2 = new int[size];

		for (int i = 0; i < array.length; i++) {
			System.out.println("enter your number for array [" + i + "]");
			array[i] = user.nextInt(); // Receive 5 numbers from the user to the array
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println("enter your number for array2 [" + i + "]");
			array2[i] = user.nextInt(); // Receive 5 numbers from the user to the array2
		}

		if (array[3] == array2[4] && array[2] == array2[3] && array[1] == array2[2] && array[0] == array2[1]
				&& array[4] == array2[0])
			System.out.println("true"); // Print if the result meets the condition we set
		else
			System.out.println("false"); // Print if the result does not meet the condition we set
	}
}