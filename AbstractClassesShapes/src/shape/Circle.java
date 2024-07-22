package shape;

public class Circle extends Shape {

	double radius;

	public Circle() {

	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double computeArea() {
		return 0;
	}

	@Override
	public String toString() {
		return "Circle [area()=" + area() + ", perimeter()=" + perimeter() + ", toString()=" + super.toString() + "]";
	}

}
