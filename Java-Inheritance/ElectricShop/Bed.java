
public class Bed {

	private String style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilt;

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public int getPillows() {
		return pillows;
	}

	public void setPillows(int pillows) {
		if (pillows < 0) {
			System.out.println("the number is lower then 0");
			pillows = 0;

		}
		this.pillows = pillows;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height < 0) {
			System.out.println("the number is lower then 0");
			height = 0;

		}
		this.height = height;
	}

	public int getSheets() {
		return sheets;
	}

	public void setSheets(int sheets) {
		if (sheets < 0) {
			System.out.println("the number is lower then 0");
			sheets = 0;

		}
		this.sheets = sheets;
	}

	public int getQuilt() {
		return quilt;
	}

	public void setQuilt(int quilt) {
		if (quilt < 0) {
			System.out.println("the number is lower then 0");
			quilt = 0;

		}
		this.quilt = quilt;
	}

	public Bed(String style, int pillows, int height, int sheets, int quilt) { // Constructor Parameters
		setStyle(style);
		setPillows(pillows);
		setHeight(height);
		setSheets(sheets);
		setQuilt(quilt);
	}

	public Bed() { // Constructor defult

		style = "QueenBed";
		pillows = 3;
		height = 4;
		sheets = 5;
		quilt = 6;

	}

	public String make() {

		return "the Bed will be redy soon!";

	}

	public String toString() {

		return style + " \n pillows size: " + pillows + "\n the height: " + height + "\n the sheets: "
				+ sheets +"\n the quilt: " + quilt;
	}

}
