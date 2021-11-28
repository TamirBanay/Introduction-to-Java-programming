package homeWork17;

public class SalesEmployee extends Employee {

	protected float commis;
	protected int salesAmount;

	public SalesEmployee(String name, float salary, float commis, int salesAmount) { // Parametric constructor
		super(name, salary);
		this.commis = commis;
		this.salesAmount = salesAmount;

	}

	public String toString() { // Return to toString
		return super.toString() + " \n commis: " + this.commis + "salesAmount :" + this.salesAmount;

	}

	public String computeSalary(int salary) { // Calculation of salary
		if (commis < 0 && commis == 0) { // Checking the correctness of commissions on demand
			commis = 1;
		}
		double computeSalaryRuturn;

		computeSalaryRuturn = (this.salary * (1 + (this.commis / 100)));// Calculation of salary
		return "Compute pay for Sales Employee: " + computeSalaryRuturn;
	}

	public float getCommis() {
		return commis;
	}

	public int getSalesAmount() {
		return salesAmount;
	}
	public String bestEmployee() { //  Check if there is a BestEmployee
		if (this.salesAmount > 100 ) { 
			return this.name + " is the best sales employee of the month. ";
		}
		return  " no one sels over 100" ;
	}
	
}
