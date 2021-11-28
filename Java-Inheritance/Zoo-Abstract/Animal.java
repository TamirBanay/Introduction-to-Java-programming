package homeWork16;

abstract public class Animal {

	protected String name;

	protected String color;

	public Animal(String name, String color) { // constructor parameter
		this.name = name;
		this.color = color;

	}

	public String toString() {// to String methods, returns all the Values of the animal

		return "name :\n" + name + "color:" + color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public abstract String eat();// abstract method

	public abstract String breath();// abstract method

	public abstract String sound();// abstract method

}
