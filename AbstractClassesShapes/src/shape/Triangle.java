package shape;

public class Triangle extends Shape {
	double length_side1;
	double length_side2;
	double length_side3;

	public Triangle(double length_side1, double length_side2, double length_side3) {
		super();
		this.length_side1 = length_side1;
		this.length_side2 = length_side2;
		this.length_side3 = length_side3;
	}

	public double getLength_side1() {
		return length_side1;
	}

	public void setLength_side1(double length_side1) {
		this.length_side1 = length_side1;
	}

	public double getLength_side2() {
		return length_side2;
	}

	public void setLength_side2(double length_side2) {
		this.length_side2 = length_side2;
	}

	public double getLength_side3() {
		return length_side3;
	}

	public void setLength_side3(double length_side3) {
		this.length_side3 = length_side3;
	}

	public double area() {

		return (length_side1 + length_side2 + length_side3) / 2;
	}

	public double perimeter() {
		double a = (length_side1 + length_side2 + length_side3) / 2;
		return Math.sqrt(a * (a - length_side1) * (a - length_side2) * (a - length_side3));
	}

	@Override
	public double computeArea() {
		return 0;
	}

	@Override
	public String toString() {
		return "Triangle [area()=" + area() + ", perimeter()=" + perimeter() + ", toString()=" + super.toString() + "]";
	}

}
