

package homeWork13;

public class Supermarket {

	private String address;
	private int numberOfEmployees;
	private int numberOfProducts;
	private int numberOfRegisters;
	private double averageIncome;

	public Supermarket() {// Constructor Deputial 
		address = "SupermarketA";
		numberOfEmployees = 0;
		numberOfProducts = 0;
		averageIncome = 0;
		numberOfRegisters = 0;
	}

	public Supermarket(Supermarket s) { // Constructor copying 
		this.address = s.address;
		this.averageIncome = s.averageIncome;
		this.numberOfEmployees = s.numberOfEmployees;
		this.numberOfProducts = s.numberOfProducts;
		this.numberOfRegisters = s.numberOfRegisters;
	}

	public Supermarket(String address, int numberOfEmployees, int numberOfProducts, double averageIncome,
			int numberOfRegisters) {// Constructor Parameters  
		setAddress (address);
		setAverageIncome (averageIncome);
		setNumberOfEmployees (numberOfEmployees);
		setNumberOfProducts (numberOfProducts);
		setNumberOfRegisters(numberOfRegisters);
	}

	public int getNumberOfRegisters() {
		return numberOfRegisters;
	}

	public void setNumberOfRegisters(int numberOfRegisters) {
		if (numberOfRegisters < 0) { // Set Conditions for numberOfRegisters
			System.out.println("the number is lower then 0");
			numberOfRegisters = 0;

		}
		this.numberOfRegisters = numberOfRegisters;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		if (numberOfEmployees < 0) { // Set conditions for NumberOfEmployees
			System.out.println("the number is lower then 0");
			numberOfEmployees = 0;
		}

		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfProducts() {
		return numberOfProducts;
	}

	public void setNumberOfProducts(int numberOfProducts) {
		if (numberOfProducts < 0) { // Set conditions for numberOfProducts
			System.out.println("the number is lower then 0");
			numberOfProducts = 0;
		}
		this.numberOfProducts = numberOfProducts;
	}

	public double getAverageIncome() {
		return averageIncome;
	}

	public void setAverageIncome(double averageIncome) {
		if (averageIncome < 0) { // Set conditions for averageIncome
			System.out.println("the number is lower then 0");
			averageIncome = 0;
		}
		this.averageIncome = averageIncome;
	}

	public boolean isEfficient() {

		if (this.numberOfEmployees / this.numberOfRegisters > 3 
				|| this.numberOfProducts / this.numberOfEmployees < 50
				|| this.averageIncome < 40000) {
			return false;
		} else {

			return true;
		}
	}

}
