package homeWork16;

public abstract class Bird extends Animal {// import the Details from Animal
	protected boolean inCage;

	public Bird(String name, String color, boolean inCage) {// constructor parameter
		super(name, color);
		this.inCage = inCage;
	}

	public String toString() {// to String methods

		return super.toString() + "\n the breed in cage? :" + this.inCage;
	}

	public abstract String eat();// eat methods

	public String breath() {// breath methods
		return this.name + ": breathes in, breathes out, and repeat";

	}

	public abstract String sound();//abstract method sound 

	public abstract String fly();// abstract methods fly

	public void getInCage() {// in cage methods, tell you of the bird in cage
		if (this.inCage) {

			System.out.println(this.name + ": already in the cage");

		} else {
			this.inCage = true;
			System.out.println(this.name + ": entered the cage");
		}

	}

	public String getOutTheCage() {// out of cage methods, tell you of the bird out cage
		if (!(inCage)) {
			return this.name + ": already out the cage ";

		} else {
			return this.name + ": getting out the cage";

		}

	}

}
