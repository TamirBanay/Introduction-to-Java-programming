package homeWork10;

import java.util.Scanner;

public class Assignment10 {

	static Scanner user = new Scanner(System.in);

	public static void main(String[] args) {

		// ----------------- Question 1 ----------------------
		System.out.println(" ---------Question 1---------------");

		boolean result = true;
		int num, digit;
		System.out.println("choose your num");
		num = user.nextInt();
		System.out.println("choose your digit");
		digit = user.nextInt();
		result = numAndDigit(num, digit);
		System.out.println(result);

		// ----------------- Question 2 ----------------------
		System.out.println(" ---------Question 2---------------");
		System.out.println("choose the size of the array");
		int size = user.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter your number for array [" + i + "]");
			array[i] = user.nextInt();
		}
		System.out.println(oddArray(array, size - 1));
		// ----------------- Question 3----------------------
		System.out.println(" ---------Question 3---------------");
		System.out.println("choose your string");
		String s = user.next();
		int last = 0;
		int first = 0;
		last = s.length() - 1;
		System.out.println(switchLetters(s, first, last));
		switchLetters(s, first, last);
		// ----------------- Question 4----------------------
		System.out.println(" ---------Question 4---------------");
		System.out.println("choose the num yor want to convert to bin cod:");
		int num1 = user.nextInt();
		System.out.println("the bin number is: " + decToBin(num1));

	}

// ------------- Question 4 ------------
// ------------- function 1 ------------
	public static long decToBin(int dec) {

		if (dec == 0)
			return 0;

		return dec % 2 + decToBin(dec / 2) * 10;
	}

// ------------- Question 3 ------------
// ------------- function 1 ------------
	public static String switchLetters(String s1, int firstL, int lastL) {

		if (lastL == 0)

			return s1;
		else
			return s1.charAt(lastL) + switchLetters(s1.substring(firstL, lastL), firstL, lastL - 1);

	}

// ------------- Question 2 ------------
// ------------- function 1 ------------

	public static boolean oddArray(int[] array, int size) {
		boolean check = true;

		if (size >= 0) {
			if (array[size] % 2 == 0) {
				check = false;
				oddArray(array, size - 1);

			} else {
				oddArray(array, size - 1);

			}

		}
		return check;

	}

// ------------- Question 1 ------------
// ------------- function 1 ------------
	public static boolean numAndDigit(int num, int digit) {

		if (digit == num % 10)
			return true;
		if (num == 0)
			return false;

		return numAndDigit(num / 10, digit);

	}
}