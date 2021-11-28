import java.util.Scanner;

public class Exe_2_librery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tamir = new Scanner(System.in);

		char answer;
		final int MAXBOOK_AGE18 = 5;
		final int MAXBOOK_AGE6TO18 = 3;
		int age;

		System.out.println(
				"if your age lower then 6 press 1 \n if your age is 6-18 press 2 \nif your age is 18 + press 3 ");
		age = tamir.nextInt();

		switch (age) {

		case 1:
			if (age < 6) {
				System.out.println("you too young for rent a book ");
			}
			break;
		case 2:
			System.out.println("you have a book over mounth? y/n");
			answer = tamir.next().charAt(0);

			if (answer == 'y' || answer == 'Y') {
				System.out.println("you cant take book");
			}

			else
				System.out.println("choose your book");
			if (age > 18)

				System.out.println("your subscription allow you to take " + MAXBOOK_AGE18);

			break;

		case 3:

			System.out.println("you have a book over mounth? y/n");
			answer = tamir.next().charAt(0);

			if (answer == 'y' || answer == 'Y') {
				System.out.println("you cant take book");
			}

			else
				System.out.println("choose your book");
			if (age <= 18 && age >= 6)
				System.out.println("your subscription allow you to take " + MAXBOOK_AGE6TO18);
			break;

		}

	}

}
