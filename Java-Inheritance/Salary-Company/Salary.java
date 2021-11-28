package homeWork17;

import java.util.Iterator;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("How much employee you need? ");
		int workers = user.nextInt(); // Receiving the number of employees from the user

		Employee employee[] = new Employee[workers];// array for employee

		for (int i = 0; i < workers; i++) {

			System.out.println(" are you looking for a \n 1: Sales employee \n 2: manager \n 3: sels manager");
			int choose = user.nextInt(); // Entering the employee type selection from the user

			if (choose > 1 || choose < 3) {

				// ------------------------ Sales employee------------------------------
				if (choose == 1) {

					System.out.println("what the name of the Sales employee?");
					String name = user.next(); // Receiving the employee's name

					System.out.println("what the salary?");
					float salary = user.nextFloat(); // Receiving the salary amount

					System.out.println("what the commis?");
					float commis = user.nextFloat(); // Receiving the commis amount

					System.out.println("what the sales amount?");
					int salesAmount = user.nextInt();// Receiving the sales amount

					employee[i] = new SalesEmployee(name, salary, commis, salesAmount);
				}
				// --------------------------manager----------------------------
				if (choose == 2) {
					System.out.println("what the name of the manager?");
					String name = user.next(); // Receiving the employee's name

					System.out.println("what the salary?");
					float salary = user.nextFloat(); // Receiving the salary amount

					System.out.println("what the kmult?");
					float kmult = user.nextFloat(); // Receiving the kmult

					employee[i] = new Manager(name, salary, kmult);

				}
				// ----------------------sales manager--------------------------------
				if (choose == 3) {
					System.out.println("what the name of the sels manager?");
					String name = user.next(); // Receiving the employee's name

					System.out.println("what the salary?");
					float salary = user.nextFloat(); // Receiving the salary amount

					System.out.println("what the commis?");
					float commis = user.nextFloat(); // Receiving the commis amount

					System.out.println("what the sales amount?");
					int salesAmount = user.nextInt(); // Receiving the sales amount

					employee[i] = new SalesManager(name, salary, commis, salesAmount);
				}
				// ------------------------------------------------------
			}

			else {
				System.out.println("choose 1,2,3");
				choose = user.nextInt(); // Preventing a wrong choice
			}
		}
		for (int i = 0; i < employee.length; i++) { // Printing the data from the user
			System.out.println("name: " + employee[i].getName() + "\nsalary: " + employee[i].getSalary());

		}
		for (int i = 0; i < workers; i++) { // The best worker loop
			if (employee[i] instanceof SalesEmployee && employee[i] instanceof SalesManager) { 
				SalesEmployee salesEmployee = (SalesEmployee) employee[i];
				SalesManager salesManager = (SalesManager) employee[i];
				System.out.println("the best sales employee is :------>" + salesEmployee.bestEmployee()
						+ "\nthe best sales manager is :------->" + salesManager.bestManager());
			}
		}
	}

}
