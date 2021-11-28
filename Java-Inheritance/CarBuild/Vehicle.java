package homeWork15;

public class Vehicle {

	protected String name;
	protected String type;
	protected int currentVelocity;
	protected int currentDirection;

	public Vehicle(String name, String type) {
		this.type = type;
		this.name = name;
		this.currentVelocity = 0;
		this.currentDirection = 0;

	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void steer(int direction) {
		this.currentDirection = direction;
		System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees");

	}

	public void move(int direction, int velocity) {
		this.currentDirection = direction;
		this.currentVelocity = velocity;
		System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
	}

	public void stop() {
		this.currentVelocity = 0;
	}

	public String toString() {

		return "\n" + name + "\n" + type + "\n" + currentVelocity + "\n" + currentDirection;
	}

	public boolean equals(Vehicle other) {
		
		
		
		if (this.name != other.name) {
			return false;
		}
		 
		if (this.type != other.type ) {
			return false;
		}
		if(this.currentVelocity != other.currentVelocity) {
			return false;
		}
		if (this.currentDirection != other.currentDirection) {
			return false;
		}
		return true;
		
		}


	}


