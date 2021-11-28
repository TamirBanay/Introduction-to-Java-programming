package homeWork17;

public class Manager extends Employee {
	protected float kmult;

	public Manager(String name, float salary, float kmult) { // Parametric constructor
		super(name, salary);
		this.kmult = kmult;
	}

	public String toString() {
		return super.toString() + "\n kmult: " + this.kmult;
	}

	public String computeSalary(int salary) { // Salary calculation

		return "Compute pay for Manager: " + (this.kmult * this.salary);
	}

	public float getKmult() {
		return kmult;
	}

}
