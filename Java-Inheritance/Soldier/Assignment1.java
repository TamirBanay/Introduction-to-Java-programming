package homeWork12;

import java.util.Iterator;
import java.util.Scanner;

public class Assignment1 {
	public static Scanner user = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//-----------------------------------------------------		
		String s1 = "abcabdxyzxabcda";
		String s2 = "abc";

		System.out.println(subString(s1, s2));
//-----------------------------------------------------		

		int[] arr = { 31, 11, 5, 4, 13, 4 }; 
		System.out.println(recSumMinMaxArr(arr));
//-----------------------------------------------------		

		Soldier s = new Soldier();
		System.out.println(s.toString());
		
		//-----------------------------------------------------		

		int col = 4;
		int row = 5;
		int[][] arr1 = new int[row][col];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				
				 arr1 [i][j] = user.nextInt();
				 System.out.println("arr["+i+"]");
			}
		}
for (int i = 0; i < arr1.length; i++) {
	for (int j = 0; j < arr1[i].length; j++) {
		System.out.print(arr1[i][j]+"  ");
	}
	System.out.println();
}
System.out.println(matrix(arr1));


	}

//Ex 1------------------------------------------------
	public static int recSumMinMaxArr(int[] arr) {

		return recSumMinArr(arr, 0, arr[0]) + recSumMaxArr(arr, 0, arr[0]);

	}

	public static int recSumMinArr(int[] arr, int index, int min) {
		if (index == arr.length)
			return min;
		if (arr[index] < min)
			min = arr[index];
		return recSumMinArr(arr, index + 1, min);

	}

	public static int recSumMaxArr(int[] arr, int index, int max) {
		if (index == arr.length)
			return max;

		if (arr[index] > max)
			max = arr[index];

		return recSumMaxArr(arr, index + 1, max);

	}
	// Ex 2------------------------------------------------

	public static boolean matrix(int[][] arr) {
		int sumOfCal = 0;
		int sumOfRow = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (j % 2 == 0) {
					sumOfCal += arr[i][j];
				}
				if (i % 2 == 1) {
					sumOfRow += arr[i][j];
				}

			}
		}
		if (sumOfRow == sumOfRow)
			return true;
		else
			return false;
	}

	// Ex 3------------------------------------------------

	public static int subString(String str, String substr) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < substr.length(); j++) {
				if (i + j >= str.length())
					break;
				if (!(str.charAt(i + j) == substr.charAt(j)))
					break;
				if (j == substr.length() - 1)
					counter++;

			}

		}
		return counter;

	}

}
