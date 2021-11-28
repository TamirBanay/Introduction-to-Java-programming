
package homeWork13;

public class Television {
	private String company;
	private String model;
	private int size;
	private int price;

	public Television(String company, String model, int size, int price) {
		this.company = company;
		this.model = model;
		this.price = price;
		this.size = size;
	}

	public Television(Television t) {// Constructor copying 
		this.company = t.company;
		this.model = t.model;
		this.price = t.price;
		this.size = t.size;

	}

	public Television() {// Constructor Deputial  
		this.company = "companyA";
		this.model = "modelA";
		this.price = 0;
		this.size = 0;
	}

	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size < 0) { // Setting conditions for size
			System.out.println("the number is lower then 0");
			size = 0;
		}
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) { // Setting conditions for price
			System.out.println("the number is lower then 0");

			price = 0;
		}
		this.price = price;
	}

	public boolean isExpensiveAndSmall() {
		if (price > 5000 && size < 21) { // Setting conditions for price and size
			return true;
		} else {
			return false;
		}
	}

}
