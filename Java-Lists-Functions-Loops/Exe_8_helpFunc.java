package homeWork8;

import java.util.Iterator;
import java.util.Scanner;

public class Exe_8_helpFunc {
	public static Scanner sc = new Scanner(System.in);

	// -------------function 1 ------------

	public static void main(String[] args) {

		int[] array1;
		int[][] matrix;
		int row;
		int col;

		System.out.println("enter your choice\n1. build array \n2.build matrix");
		int user = sc.nextInt();

		switch (user) {
		case 1:
			System.out.println("How meny index do you whant in the array?");
			int choice = sc.nextInt();
			array1 = initArray(choice);

			System.out.println("to build array of stars press 1");
			user = sc.nextInt();
			if (user == 1) {
				arrayOfStars(array1);

			}

			break;

		case 2:

			System.out.println("enter your matrix col");
			row = sc.nextInt();
			System.out.println("enter your matrix row");
			col = sc.nextInt();

			matrix = initArray(row, col);

			System.out.println("for magic cube press 1");
			System.out.println("for mirror matrix press 2");
			user = sc.nextInt();
			if (user == 1) {
				MagicCube(matrix);
			} else if (user == 2) {
				mirorMatrix(matrix);
			}

			break;

		default:
			break;
		}

	}

	// -------------Question 1 ------------
	// -------------function 1 ------------
	public static int[] initArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter your integer for index[ " + i + "]");
			array[i] = sc.nextInt();

		}

		return (array);

	}

	// -------------function 2 ------------

	public static int[][] initArray(int row, int col) {
		int[][] arry2 = new int[row][col];
		for (int i = 0; i < row; i++) {
			arry2[i] = initArray(col);
		}

		return arry2;

	}
	// -------------function 3 ------------

	public static void print(int[][] initMatrix) {

		for (int i = 0; i < initMatrix.length; i++) {
			for (int j = 0; j < initMatrix[i].length; j++) {
				System.out.print(initMatrix[i][j]);
				System.out.print(" ");

			}
			System.out.println();
		}

	}
	// -------------Question 2 ------------
	// -------------function 1 ------------

	public static void arrayOfStars(int[] array) {

		int row = 0, col = array.length;
		int numOfSpaceInCol;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > row)
				row = array[i];

		}

		char[][] arrOfChar = new char[row][col];
		for (int i = 0; i < col; i++) {
			numOfSpaceInCol = row - array[i];
			for (int j = 0; j < row; j++) {
				if (j < numOfSpaceInCol)
					arrOfChar[j][i] = ' ';
				else
					arrOfChar[j][i] = '*';

			}

		}
		for (int i = 0; i < arrOfChar.length; i++) {
			for (int j = 0; j < arrOfChar[i].length; j++) {
				System.out.print(arrOfChar[i][j]);
				System.out.print(" ");

			}

			System.out.println();

		}
		for (int i = 0; i < array.length * 2; i++) {
			System.out.print('-');
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");

		}
	}

	// -------------Question 3 ------------
	// -------------function 1 ------------
	public static int MagicCube(int[][] myArr) {

		int row = 0;
		int col = 0;
		int slash = 0;
		int sum = 0;

		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[i].length; j++) {
				System.out.print(myArr[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < myArr.length; i++) {
			sum += myArr[i][0];
		}

		System.out.println();

		for (int i = 0; i < myArr.length; i++) {// בדיקת שורות
			row += myArr[2][i];

		}
		for (int i = 0; i < myArr.length; i++) { // בדיקת עמודות
			col += myArr[i][0];
		}
		for (int i = 0; i < myArr.length; i++) { // בדיקת אלכסונים
			for (int j = 0; j < myArr[i].length; j++) {

				if (myArr[i] == myArr[j]) {
					slash += myArr[i][j];
				}

			}

		}

		if (slash == sum && col == sum && row == sum) {
			System.out.println(" MAGIC CUBE");
		} else
			System.out.println("FAKE MAGIC CUBE");

		return 0;

	}
	// -------------Question 4 ------------
	// -------------function 1 ------------

	public static boolean mirorMatrix(int[][] array) {
		boolean mirror = false;
		int counter = 0;
		int size = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length / 2; j++) {
				if (array[i][j] == array[i].length - size)
					counter++;
				size++;
			}

		}
		if (counter == (array[0].length / 2) * array.length)
			System.out.println(mirror);
		else
			System.out.println("true");

		return mirror;

	}
}
