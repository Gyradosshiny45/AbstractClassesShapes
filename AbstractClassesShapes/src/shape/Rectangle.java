package shape;

public class Rectangle extends Shape {
	double width;
	double length;

	public Rectangle() {

	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double area() {
		return width * length;
	}

	public double perimeter() {

		return 2 * (width * length);
	}

	@Override
	public double computeArea() {
		return 0;
	}

	@Override
	public String toString() {
		return "Rectangle [area()=" + area() + ", perimeter()=" + perimeter() + ", toString()=" + super.toString()
				+ "]";
	}

}
