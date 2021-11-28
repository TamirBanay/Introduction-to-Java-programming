package homework7;

import java.util.Scanner;

public class exe_2_dubletow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);

		int size = 10;
		int sum = 0;
		int[] array = new int[size];

		for (int i = 0; i < 2; i++) {
			System.out.println("enter[" + (i + 1) + "] integer");
			array[i] = user.nextInt(); // Enter numbers from the user into the Array
		}
		sum = array[0] + array[1]; // Setting the Sum
		for (int i =2; i < array.length; i++) {
			array[i] += sum;  // Calculating variable array[i]
			sum += array[i - 1];  // Calculating variable Sum
		}
for (int i = 0; i < array.length; i++) {
	System.out.print(array[i]+" "); // Print result to user according to the calculation of the variables
	

}

	}

}
