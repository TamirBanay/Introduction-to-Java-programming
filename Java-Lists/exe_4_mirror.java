package homework7;

import java.util.Scanner;

public class exe_4_mirror {
	static Scanner user = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int check;
		int mirror = 0;
		int size;
		System.out.println("Hello , please enter positive number");
		size = user.nextInt();
		if (size % 2 == 1)
			System.out.println("enter a possitive number"); // Request for a positive number from the user

		else {
			int array[] = new int[size];

			for (int i = 0; i < array.length; i++) {
				System.out.println("enter your number for array [" + i + "]");
				array[i] = user.nextInt(); // Receiving numbers from the user
			}
			for (int i = 0; i < size / 2; i++) {
				check = getReverseNum(array[i]); // Setting a Check variable
				if (check == array[size - 1]) { 
					mirror++;
				}
				size--;
			}

			if (mirror == size / 2) { 
				System.out.println("true"); // If Mirror is equal to size divide 2
			} else {
				System.out.println("false"); // If Mirror is not equal to size divide 2
			}

		}

	}

	public static int getReverseNum(int number) {

		int reversNum = 0;
		int newNum = 0;

		while (number != 0) {

			newNum = number % 10; // newNum variable calculation
			reversNum = reversNum * 10 + newNum; // reversNum variable calculation
			number /= 10;

		}
		return (reversNum);
	}
}
