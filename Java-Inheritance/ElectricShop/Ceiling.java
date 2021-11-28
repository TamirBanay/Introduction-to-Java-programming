
public class Ceiling {
	private int height;
	private int paintedColor;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getPaintedColor() {
		return paintedColor;
	}

	public void setPaintedColor(int paintedColor) {
		this.paintedColor = paintedColor;
	}

	public Ceiling(int height, int paintedColor) {// Constructor Parameters
		setHeight(height);
		setPaintedColor(paintedColor);

	}
	public String toString() {
		
		return "\n height: "+ height + "\n paintedColor: "+paintedColor;
	}
	
}
