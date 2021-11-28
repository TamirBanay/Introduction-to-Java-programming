import java.util.Scanner;

public class exe_1_wedding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tamir = new Scanner(System.in);

		final int CLOSE_RELAYEV = 500;
		final int FAMILY = 1000;
		final int OTHER = 250;
		int years = 3;
		int driveTime = 60;
		int totalCash = 0;

		System.out.println(	"hello, plese tell me what is your relashrnship whit the cupel \n1.close frinds \n2.family \n3.other ");
		int choeseUser = tamir.nextInt();

		switch (choeseUser) {
		case 1:
			System.out.println("how long do you know?");
			choeseUser = tamir.nextInt();

			if (choeseUser > years)

				totalCash = CLOSE_RELAYEV + 50;
			System.out.println("how long is your drive");

			choeseUser = tamir.nextInt();
			if (choeseUser > driveTime)
				totalCash -= 50;

			System.out.println("your recomended check is:" + totalCash);
			break;

		case 2:
			System.out.println("how long do you know?");
			choeseUser = tamir.nextInt();

			if (choeseUser > years)

				totalCash = FAMILY;
			System.out.println("how long is your drive");
			choeseUser = tamir.nextInt();

			if (choeseUser > driveTime)
				totalCash = FAMILY;

			System.out.println("your are a family so your check is" + totalCash + "$");

			break;

		case 3:
			System.out.println("how long do you know?");
			choeseUser = tamir.nextInt();
			if (choeseUser > driveTime)
				totalCash = OTHER;

			totalCash = OTHER + 50;
			System.out.println("how long is your drive in min? ");
			choeseUser = tamir.nextInt();
			if (choeseUser > driveTime)
				totalCash = OTHER - 50;

			System.out.println("you need to pay only:" + totalCash);
			break;
		}

		System.out.println("enjoy :) ");

	}
}
