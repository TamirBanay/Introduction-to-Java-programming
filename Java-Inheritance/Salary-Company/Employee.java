package homeWork17;

public class Employee {
	protected String name;
	protected float salary;

	public Employee(String name,float salary  ) { // Parametric constructor
		this.name = name;
		this.salary = salary;
	}
	public String toString () { // Return to toString
		return "name: " + name + "\n salary: "+ salary;
	}
	public String computeSalary () { // Salary calculation
		return "Compute pay for Employee: " +  this.salary;
		
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
}
