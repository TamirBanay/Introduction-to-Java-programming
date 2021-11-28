package homeWork17;

public class SalesManager extends SalesEmployee {

	public SalesManager(String name, float salary, float commis, int salesAmount) { 
		super(name, salary, commis, salesAmount);

	}

	public String toString() {

		return super.toString();
	}

	public String computeSalary(int salary) {
		if (commis <= 0) { // Calculation that the commission is in compliance with the requirement
			commis = 1;
		}
		double computeSalaryRuturn = (this.salary * (1 + (this.commis / 100))); // Calculation of salary

		return "Compute pay for Sales Manager" + computeSalaryRuturn;
	}

	public String bestManager() { 
		if (this.salesAmount >= 50) { // Check for bestManger
			return this.name + " is the best sales manager of the month.";
		}
		return " no one sales over 50 ";
	}

}
