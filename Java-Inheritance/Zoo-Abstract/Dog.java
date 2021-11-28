package homeWork16;

public class Dog extends Animal {

	protected String breed;

	public Dog(String name, String color, String breed) {//constructor parameter
		super(name, color);// import the Details from Animal
		this.breed = breed;
	}

	public String toString() {// to String methods, returns all the Values of the dog
		return "breed: " + breed + "\n" + super.toString();
	}

	@Override
	public String eat() { // eat methods

		return this.name + ": is eating meat ";
	}

	@Override
	public String breath() {// breath methods
		return this.name + ": breathes in, breathes out, and repeat";
	}

	@Override
	public String sound() {// sound methods
		return this.name + ": Burk!";
	}

	public String play(Dog friend) {// constructor  
		if (this.name == null) {
			return this.name + "playing with a bone... ";
		} else {
			return this.name + " playing with: " + friend.name;

		}

	}
}
