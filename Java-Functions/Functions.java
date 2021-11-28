import java.util.Scanner;

public class Assignment6 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int option = 0;
		do { // Inserting a loop do

			getMenuChoice(); // Main menu view function
			option = sc.nextInt(); // Select the menu option

			switch (option) { // Insert Switch case into menu
			case 1:

				System.out.println("Please enter your number");
				int num = sc.nextInt(); // Selecting numbers

				addOneToNum(num); // Activating the addOneToNum function
				System.out.println();
				System.out.print("----------------------------------------------------------");

				break;
			case 2:
				char c;
				int size;
				System.out.println("choose your char");
				c = sc.next().charAt(0); // Character selection
				System.out.println("please enter number");
				size = sc.nextInt(); // Select a number

				printTriangle(size, c); // Activating the printTriangle function
				System.out.println();
				System.out.print("----------------------------------------------------------");

				break;

			case 3:
				System.out.println("Please enter your number");
				size = sc.nextInt(); // Selection of the number by the user
				printSquare(size); // Activating the printSquare function
				System.out.println();
				System.out.print("----------------------------------------------------------");

				break;

			case 4:
				System.out.println("please enter number");
				num = sc.nextInt(); // Select a number
				System.out.println(isPrime(num)); // Activating the isPrime function
				System.out.println();
				System.out.print("----------------------------------------------------------");

				break;

			default: // If no case number is selected
				if (option > 5) {

					System.out.println("worng choose"); // Displays the wrong choice to the user
				}
			}

		} while (option != 5 || option < 5); // Loop if and the number is not equal to 5, if equal to 5 do not continue
												// the loop
		System.out.println("program done"); // Stop the program

	}

// Ex.1
	public static int getMenuChoice() { // Function of the main menu

		System.out.println();
		System.out.println("Hi dear user");
		System.out.println(
				"please enter ur choise in the menu\n 1. Increases all digits of the number by 1 \n 2.you can choose your char and your number  \n 3.make your rectangle whit *,# \n 4.choose number and get - 1 for Prime number\n 5.End Program "
						+ ""); // Menu view
		return 0;

	}

// Ex.2
	public static int addOneToNum(int num) {

		int digit = 0;
		int round = 1;
		int totalSum = 0;
		while (num != 0) { // If the number is not equal to 0
			digit = num / 10; // digit equals num divide 10
			digit = digit * 10; // digit equals double digit 10
			digit = num - digit; // digit equals num less digit
			if (digit == 9) // If the digit is equal to 9
				digit = 0; // digit will be equal to 0
			else
				digit++; //
			totalSum = totalSum + round * digit; // totalSum equals totalSum plus round double digit
			num /= 10;
			round *= 10;

		}
		System.out.print(totalSum); // Print result: totalSum
		return 5;

	}

// Ex.3
	public static void printTriangle(int size, char c) {

		int numOfSpace;

		for (int i = 0; i < size; i++) {
			numOfSpace = i * 2; // numOfSpace equals i double 2
			for (int j = 1; j <= size * 2; j++) {
				if (j <= size - i) // If j is less than or equal to size less 1
					System.out.print(c); // Print the character selection
				else if (numOfSpace > 0) { // If numOfSpace is greater than 0
					System.out.print(" "); // Print a space
					numOfSpace--;
				} else
					System.out.print(c);

			}
			System.out.println();
		}

	}

//Ex.4
	public static void printSquare(int size) {

		for (int i = 0; i <= size; i++) { // Loop when i is small equal to size adds 1
			for (int j = 0; j <= i - 1; j++) { // A loop that advances the j and adds * as required

				System.out.print("*"); // Asterisk printing
			}
			for (int j = i; j < size; j++) {
				if (i == 0 && j >= 0 && j <= size)
					System.out.print(" ");
				else
					System.out.print("#");

			}
			System.out.println("");

		}

	}

	// Ex.5
	public static int isPrime(int num) {

		int i, isPrime = 1;
		for (i = 2; i <= num / 2; i++) { // If i is less than or equal to num divide by 2, add +1 to i

			if (num % i == 0) { // If num modulo i is equal to 0

				isPrime = 0; // isPrime becomes 0
			}
		}

		return isPrime;
	}

}