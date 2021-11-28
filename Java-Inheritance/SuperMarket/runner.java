
package homeWork13;

public class runner {

	public static void main(String[] args) {
		

		// Exe.2--------------------------------------------------
		System.out.println("Exe.2");
System.out.println("-----------");
		Supermarket s = new Supermarket(); // Setting up the supermarket in runner

		s.setNumberOfRegisters(3); // Number of Registers
		s.setNumberOfEmployees(9); // number of workers
		s.setAverageIncome(50000); // number of averageincome
		s.setNumberOfProducts(600); // Number of products
		System.out.println(s.isEfficient());

		Supermarket s2 = s;
		s2.setAverageIncome(300); // Setting an average
		System.out.println(s2.isEfficient()); 

		Supermarket s3 = s2;
		s2.setAverageIncome(60000);
		System.out.println(s3.isEfficient());

		// Exe.3--------------------------------------------------
System.out.println("Exe.3");
System.out.println("-----------");
		Television t = new Television(); // Setting up a connection to the Television class
		t.setPrice(5000); // Price setting
		t.setSize(21);
		System.out.println("\n" + t.isExpensiveAndSmall());

		Television t2 = t;
		t2.setPrice(4000);
		t2.setSize(30);
		System.out.println(t2.isExpensiveAndSmall());

		Television t3 = t2;
		t3.setPrice(8000);
		t3.setSize(40);
		System.out.println(t3.isExpensiveAndSmall());

		// Exe.4--------------------------------------------------

		System.out.println("Exe.4");
		System.out.println("-----------");

		MyPoint m = new MyPoint(); // Setting up a connection to the MyPoint class
		m.setX(50);
		m.setY(3);
		
		System.out.println("\n"+ m.distance(5, 2));
	}

}