package homeWork15;

public class Outlander extends Car {

	protected int roadServiceMonths;

	public Outlander(int roadServiceMonths) {
		super("Outlander", "4WD", 4, 5, 5, true, 3);
		this.roadServiceMonths = roadServiceMonths;

	}

	public void accelerate(int rate) {

		int newSpeed = this.currentVelocity + rate;
		if (newSpeed == 0) {
			System.out.println("your speed is 0");
			gears = 1;
		}
		if (newSpeed >= 1 || newSpeed <= 10) {
			gears = 1;

		}
		if (newSpeed >= 11 || newSpeed <= 20) {
			gears = 2;
		}
		if (newSpeed >= 21 || newSpeed <= 30) {
			gears = 3;
		}
		if (newSpeed > 30) {
			gears = 4;
		}
		if (newSpeed > 0) {
			changeVelocity(newSpeed, currentDirection);
		}
	}
		public boolean equals (Outlander other) {
			if(super.equals(other)) {
				if(this.roadServiceMonths==other.roadServiceMonths)
					return true;
			}
			return false;
			
		
	}

	@Override
	public String toString() {
		
		return super.toString() + "road Service Months: " + roadServiceMonths;
	}

}
