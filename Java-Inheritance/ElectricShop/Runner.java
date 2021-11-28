
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wall w1 = new Wall("north");
		Wall w2 = new Wall("south");
		Wall w3 = new Wall("east");
		Wall w4 = new Wall("west");

		Ceiling c = new Ceiling(5, 65);

		Bed b = new Bed("queen",2,2,1,6);
		
		Lamp l = new Lamp();
	
		
		Bedroom m = new Bedroom(w1,w2,w3,w4,c,l,b);		
		
	System.out.println(m.toString());
	System.out.println( "\n "+ m.makeBed());
		

	}
}
