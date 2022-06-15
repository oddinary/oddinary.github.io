
public class Circle extends Shape{
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
}
