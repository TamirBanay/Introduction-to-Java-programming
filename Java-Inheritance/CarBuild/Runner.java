package homeWork15;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outlander o = new Outlander(5);
		Outlander o1 = new Outlander(5);
		o.steer(45);
		o.accelerate(50);
		o1.accelerate(-35);
		
		System.out.println(o.toString());
		System.out.println("\n"+o.equals(o1));
		
		}

}
