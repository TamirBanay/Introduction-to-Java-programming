import java.util.Scanner;

public class Exe_3_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tamir = new Scanner(System.in);

		char sign = '1';
		int num;
		int num1;
		int result;
		while (sign != '$') {
			System.out.println("choose first numbers");
			num = tamir.nextInt();

			System.out.println("choose seccont numbers");
			num1 = tamir.nextInt();

			System.out.println("choose your char.");
			sign = tamir.next().charAt(0);

			switch (sign) {

			case '*':
				System.out.println(num * num1);
				break;

			case '-':
				System.out.println(num - num1);
				break;

			case '/':
				System.out.println(num / num1);
				break;

			case '%':
				System.out.println(num % num1); 
				break;

			case '^':

				float base = num;
				float exponent = num1;
				float result1 = num;
				if (exponent <= 0)
					result1 = 1;
				while (exponent > 1) {
					result1 *= base;
					exponent--;
				}

				while (exponent < 0) {
					result1 /= base;
					exponent++;

				}

				System.out.println(result1); 
				break;
			default:
				System.out.println("wrong choice");
				break;

			case '$':
				System.out.println("call");
				break;

		

			}
		}
	}

}
