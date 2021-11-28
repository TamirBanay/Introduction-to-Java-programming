package homeWork16;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);

		Animal animal[] = new Animal[3];
		// -------------------------- Dog---------------------
		System.out.println("\n" + "now yoe need to choose Characteristics for Dog");

		System.out.println("\n" + "the name: ");
		String name = user.next();
		System.out.println("\n" + "the color: ");
		String color = user.next();
		System.out.println("\n" + "the breed: ");
		String breed = user.next();
		animal[0] = new Dog(name, color, breed);
		// -------------------------- Parrot---------------------
		System.out.println("\n" + "now yoe need to choose Characteristics for parrot");
		System.out.println("\n" + "the name: ");
		name = user.next();
		System.out.println("\n" + "the color: ");
		color = user.next();
		System.out.println("\n" + "in Cage: ");
		boolean inCage = user.hasNext();
		animal[1] = new Parrot(name, color, inCage);
		// -------------------------- penguin---------------------
		System.out.println("\n" + "now yoe need to choose Characteristics for penguin");
		System.out.println("\n" + "the name: ");
		name = user.next();
		System.out.println("\n" + "the color: ");
		color = user.next();
		System.out.println("\n" + "in Cage: ");
		inCage = user.hasNext();
		animal[2] = new Penguin(name, color, inCage);

		// -------------------------- Dog---------------------
		animal[0].eat();
		animal[0].breath();
		animal[0].sound();
		System.out.println(animal[0].toString());
		// -------------------------- Parrot---------------------
		animal[1].eat();
		animal[1].breath();
		animal[1].sound();
		System.out.println(animal[1].toString());
		// -------------------------- penguin---------------------
		animal[2].eat();
		animal[2].breath();
		animal[2].sound();
		System.out.println(animal[2].toString());
		// -------------------------- Dog---------------------
		Dog dog = new Dog(name, color, breed);
		System.out.println("\n" + "the Dog name: " + name);
		name = user.next();
		System.out.println("\n" + "the color: " + color);
		color = user.next();
		System.out.println("\n" + "the breed: " + breed);
		breed = user.next();

		// -------------------------- Parrot---------------------
		Parrot parrot = new Parrot(name, color, inCage);
		System.out.println("\n" + "the Parrot name: " + name);
		name = user.next();
		System.out.println("\n" + "the color: " + color);
		color = user.next();
		System.out.println("\n" + "in Cage: " + inCage);
		inCage = user.hasNext();

		// -------------------------- penguin---------------------
		Penguin penguin = new Penguin(name, color, inCage);
		System.out.println("\n" + "the penguin name: " + name);
		name = user.next();
		System.out.println("\n" + "the color: " + color);
		color = user.next();
		System.out.println("\n" + "in Cage: " + inCage);
		inCage = user.hasNext();

		System.out.println(dog.toString());
		System.out.println(dog.eat());
		System.out.println(dog.breath());
		System.out.println(dog.sound());
		System.out.println(dog.play(dog));

		System.out.println(parrot.toString());
		System.out.println(parrot.eat());
		System.out.println(parrot.breath());
		System.out.println(parrot.sound());
		System.out.println(parrot.fly());

		System.out.println(penguin.toString());
		System.out.println(penguin.eat());
		System.out.println(penguin.breath());
		System.out.println(penguin.sound());
		System.out.println(penguin.fly());
		System.out.println(penguin.action());

	}

}
