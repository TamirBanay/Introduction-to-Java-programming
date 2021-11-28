package homeWork16;

public class Parrot extends Bird {

	public Parrot(String name, String color, boolean inCage) {// constructor parameter
		super(name, color,  inCage);// import the Details from bird
	}

	public boolean inCage() {// in cage methods, tell you of the Parrot in cage
		if (super.inCage == true) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {// to String methods, returns all the Values of Parrot
		return "the name :\n" + this.name + "the color :\n" + color + " in cage? " + this.inCage + super.toString();
	}

	@Override
	public String eat() {// eat methods

		return this.name + ": is pecking";
	}

	@Override
	public String sound() {// sound methods
		return this.name + ": twitt";
	}

	@Override
	public String fly() {// fly methods, tell you if the parrot fly
		if (this.inCage == true) {
			return this.name + ": flies in circles";
		} else {
			return this.name + ": is flapping its wings";
		}
	}

	public String breath() {// breath methods
		return this.name + ": breathes in, breathes out, and repeat";

	}

}
