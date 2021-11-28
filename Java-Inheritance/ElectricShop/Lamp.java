
public class Lamp {

	private String style;
	private boolean battery;
	private int watt;

	public Lamp() {// Constructor defult
		style = "lamp pro";
		battery = true;
		watt = 5;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public boolean isBattery() {
		return battery;
	}

	public void setBattery(boolean battery) {
		this.battery = battery;
	}

	public int getWatt() {
		return watt;
	}

	public void setWatt(int watt) {
		if (watt < 0) {
			System.out.println("the number is lower then 0");
			watt = 0;

		}
		this.watt = watt;
	}

	public Lamp(String style, boolean battery, int watt) {// Constructor Parameters
		setWatt(watt);
		setStyle(style);
		setBattery(battery);

	}

	public boolean turnOn() {
		if (watt > 0) {
			battery = true;
		} else {
			battery = false;
		}

		return battery;

	}

	public String toString() {

		return " the name: " + style + "\n the watt: " + getWatt() + "\n the battery: " + battery + "\n the lamp is: "
				+ turnOn();
	}

}
