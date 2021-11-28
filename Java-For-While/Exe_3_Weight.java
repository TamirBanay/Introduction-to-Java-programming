package homework5;

import java.util.Scanner;

public class Exe_3_Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user = new Scanner(System.in);

		int oringNum;
		int secontNum;
		int firstNum;
		int threedNum;
		int sum;

		for (int i = 0; i < 10; i++) {
			System.out.println("Select a 3-digit numbers"); // Receiving a 3-digit number from the user
			oringNum = user.nextInt();

			firstNum = oringNum % 10; // firstNum equals oringNum module 10;
			secontNum = oringNum % 100 / 10; // secontNum equals oringNum module 100 divide 10
			threedNum = oringNum / 100; // threedNum equals oringNum divided by 100

			sum = firstNum * secontNum + threedNum * secontNum; // Setting a sum variable: firstnum variable double
																// secontNum variable plus threedNum variable double
																// scontNum variable.
			System.out.println(sum); // Print variable sum

		}
		user.close();

	}

}
