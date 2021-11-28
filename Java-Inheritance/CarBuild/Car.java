package homeWork15;

public class Car extends Vehicle {

	protected int wheels;
	protected int doors;
	protected int gears;
	protected boolean isManual;
	protected int currentGear;

	public Car(String n, String t, int w, int d, int g, boolean is, int gear) {// constrator parameters
		super(n, t);
		this.wheels = w;
		this.doors = d;
		this.gears = g;
		this.isManual = is;
		this.currentGear = 1;

	}

	public void changeGear(int currentGear) {
		this.currentGear = currentGear;

		System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear");

	}

	public void changeVelocity(int speed, int direction) {
		this.currentDirection = direction;
		this.currentVelocity = speed;
		System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
	}

	public boolean equals(Car other) {
		if (super.equals(other)) {
			
		
		if (this.wheels != other.wheels) {
			return false;
		}
		if (this.doors != other.doors) {

			return false;
		}
		if (this.gears != other.gears) {
			return false;
		}
		if (this.isManual != other.isManual) {
			return false;
		}
		if (this.currentGear != other.currentGear) {
			return false;
		}
		return true;
		}
		else return false;
	}

	public String toString() {
		return super.toString()+ "\n" + name + "\n" + "\n" + wheels + "\n" + doors + "\n" + gears + "\n" + isManual
				+ "\n" + currentGear;
	}

}
