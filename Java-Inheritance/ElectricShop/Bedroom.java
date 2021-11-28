
public class Bedroom {

	private Wall wallNorth;
	private Wall wallEast;
	private Wall wallSouth;
	private Wall wallWest;
	private Ceiling c;
	private Lamp l1;
	private Bed m1;

	public Bedroom(Bedroom b) { // Constructor copy
		this.wallNorth = wallNorth;
		this.wallSouth = wallSouth;
		this.wallWest = wallWest;
		this.wallEast = wallEast;
		this.c = c;
		this.l1 = l1;
		this.m1 = m1;

	}

	public Wall getWallNorth() {
		return wallNorth;
	}

	public Bedroom(Wall w1, Wall w2, Wall w3, Wall w4, Ceiling c, Lamp l1, Bed m1) { // Constructor paramt
		setWallNorth(wallNorth);
		setWallSouth(wallSouth);
		setWallWest(wallWest);
		setWallWest(wallWest);
		setC(c);
		setL1(l1);
		setM1(m1);
	}

	public String makeBed() {
		Bed b = new Bed();
		return "the room in progres," + " " + b.make();
	}

	public String toString() {
		Wall w = new Wall("north");
		Bed b = new Bed();
		Ceiling c = new Ceiling(2, 225);
		Lamp l = new Lamp();

		return "\n Wall direction: " + w.toString() + "\n\n Bed Name: " + b.toString() + "\n\n the ceiling " + c.toString()+"\n"
				+ "\n Lamp\n" + l.toString();

	}

	public Wall getWallEast() {
		return wallEast;
	}

	public void setWallEast(Wall wallEast) {
		this.wallEast = wallEast;
	}

	public Wall getWallSouth() {
		return wallSouth;
	}

	public void setWallSouth(Wall wallSouth) {
		this.wallSouth = wallSouth;
	}

	public Wall getWallWest() {
		return wallWest;
	}

	public void setWallWest(Wall wallWest) {
		this.wallWest = wallWest;
	}

	public Ceiling getC() {
		return c;
	}

	public void setC(Ceiling c) {
		this.c = c;
	}

	public Lamp getL1() {
		return l1;
	}

	public void setL1(Lamp l1) {
		this.l1 = l1;
	}

	public Bed getM1() {
		return m1;
	}

	public void setM1(Bed m1) {
		this.m1 = m1;
	}

	public void setWallNorth(Wall wallNorth) {
		this.wallNorth = wallNorth;
	}
}


