package homeWork16;

public class Penguin extends Bird {

	public Penguin(String name, String color, boolean inCage) {// constructor parameter
		super(name, color, inCage);// import the Details from bird

	}

	public String toString() {// to String methods, returns all the Values of Penguin
		return "the name :\n" + this.name + "the color :\n" + color + " in cage? " + this.inCage;
	}

	@Override
	public String eat() {// eat methods
		return this.name + ": is eating fish";
	}

	@Override
	public String sound() {// sound methods

		return this.name + ": makes penguin sound...";
	}

	@Override
	public String fly() {// fly methods, show you if the penguin fly

		return this.name + ": is flapping its wings...I'm not very good at that, can I go for swim instead?";
	}

	public String action() {// action methods, show you if the penguin is in action
		if (this.inCage == true) {
			return this.name + ": is swimming in the pool";
		} else {
			return this.name + ": is running away....";
		}

	}
}
