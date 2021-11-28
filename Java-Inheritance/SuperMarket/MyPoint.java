
package homeWork13;

public class MyPoint {

	private double x;
	private double y;

	public MyPoint() {// Constructor Deputial 
		x = 0;
		y = 0;

	}

	public MyPoint(double x, double y) {// Constructor Parameters 
		this.x = x;
		this.y = y;

	}
	public MyPoint (MyPoint m) { // Constructor copying 
		x = m.x;
		y = m.y;
	}


	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;

	}

	public String toString() { // Printing in tostring

		return " ";

	}

	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distance(double x, double y) {
		double a = (double) Math.sqrt(Math.pow(this.x - x, 2) + (Math.pow(this.y - y, 2))); // distance calculation

		return a;
	}

	public double distance(MyPoint m) {
		double a = (double) Math.sqrt(Math.pow(this.x - m.x, 2) + (Math.pow(this.y - m.y, 2)));

		return a;
	}

}
